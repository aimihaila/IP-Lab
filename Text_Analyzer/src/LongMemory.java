import java.sql.*;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
        To be able to connect to the database trough Java you need mysql-connector-java. (The file is on trello/LongMemory board)
        Intellij settings: CTRL+ALT+SHIFT+S -> Libraries -> [plus] (the top one) -> Java -> choose the file
        Also import java.sql.*;
 */

public class LongMemory {
    private Connection connection;

    public LongMemory() {
        String url = "jdbc:mysql://localhost:3306/brain?autoReconnect=true&useSSL=false"; //database url with auto reconnect and SSL disabled
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password); //try to connect to the database
        }
        catch (Exception e) {
            System.err.println("Connection error: " + e); //catch the connection error
        }
    }

    public LongMemory(String database) { //specify to which database to connect
        String url = "jdbc:mysql://localhost:3306/" + database + "?autoReconnect=true&useSSL=false"; //database url with auto reconnect and SSL disabled
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password); //try to connect to the database
        }
        catch (Exception e) {
            System.err.println("Connection error: " + e); //catch the connection error
        }
    }

    public LongMemory(String database, String username, String password) { //specify to which database to connect along with the username and password
        String url = "jdbc:mysql://localhost:3306/" + database + "?autoReconnect=true&useSSL=false"; //database url with auto reconnect and SSL disabled
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password); //try to connect to the database
        }
        catch (Exception e) {
            System.err.println("Connection error: " + e); //catch the connection error
        }
    }

    public Object search(String table_name, String key) {
        Object obj;
        String query;
        if(table_name.equals("concepts")) {
            obj = new Concept();
            query = "SELECT * FROM " + table_name + " WHERE LOWER(key_concept) LIKE BINARY '" + key.toLowerCase() + "'";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                if(resultSet.next()) {
                    ((Concept) obj).setFoundInDB(true);
                    ((Concept) obj).setName(resultSet.getString("key_concept"));
                    ((Concept) obj).setClassName(resultSet.getString("class"));
                    ((Concept) obj).setConceptSubclass(resultSet.getString("subclass"));
                    ((Concept) obj).setUrl(resultSet.getString("link"));
                    String[] chars = resultSet.getString("characteristic").split(",");
                    ((Concept) obj).setCharacteristics(new TreeSet<>(Arrays.asList(chars)));
                }
            }
            catch (SQLException e) {
                System.err.println("SQL Exception: " + e);
            }
        }
        else {
            obj = new ConceptClass(key);
            query = "SELECT * FROM " + table_name + " WHERE LOWER(name_class) LIKE BINARY '" + key.toLowerCase() + "'";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                if(resultSet.next()) {
                    ((ConceptClass) obj).setSubclass(resultSet.getString("subclass"));
                    String[] chars = resultSet.getString("characteristics").split(",");
                    String[] keys = resultSet.getString("keywords").split(",");
                    ((ConceptClass) obj).setCharacteristics(new TreeSet<>(Arrays.asList(chars)));
                    ((ConceptClass) obj).setKeywords(new TreeSet<>(Arrays.asList(keys)));
                }
            }
            catch (SQLException e) {
                System.err.println("SQL Exception: " + e);
            }
        }
        return obj;
    }

    public void add(Object object, String table) {
        if(table.equals("concepts")) {
            if (!((Concept)object).getCharacteristics().isEmpty()) {
                String characteristics = "";
                for (String characteristic : ((Concept)object).getCharacteristics()) { //traverse Set of characteristics and add them in characteristics String
                    if (!characteristic.equals("") && !characteristic.equals(null))
                        characteristics += characteristic + ",";
                }
                characteristics = characteristics.substring(0, characteristics.length() - 1);

                String query = "INSERT INTO concepts (key_concept, class, subclass, characteristic, link) " +
                        "       VALUES " +
                        "       ('" + ((Concept) object).getName() + "','" + ((Concept) object).getConceptClass().getNameClass() + "','" + ((Concept) object).getConceptSubclass() + "','" + characteristics + "','" + ((Concept) object).getUrl() + "')";
                try {
                    Statement statement = connection.createStatement();
                    int resultSet = statement.executeUpdate(query);
                    if (resultSet == 1) {
                        ((Concept)object).setFoundInDB(true);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Empty characteristics Set.");
            }
        } else {
            if(table.equals("concepts_class")) {
                if (!((ConceptClass) object).getCharacteristics().isEmpty() && !((ConceptClass) object).getKeywords().isEmpty()) {
                    String characteristics = "";
                    for (String characteristic : ((ConceptClass) object).getCharacteristics()) { //traverse Set of characteristics and add them in characteristics String
                        if (!characteristic.equals("") && !characteristic.equals(null))
                            characteristics += characteristic + ",";
                    }
                    characteristics = characteristics.substring(0, characteristics.length() - 1);

                    String keywords = "";
                    for (String keyword : ((ConceptClass) object).getKeywords()) { //traverse Set of keywords and add them in keywords String
                        if (!keyword.equals("") && !keyword.equals(null))
                            keywords += keyword + ",";
                    }

                    String query = "INSERT INTO concepts_class (name_class, subclass, keywords, characteristics) " +
                            "       VALUES " +
                            "       ('" + ((ConceptClass) object).getNameClass() + "','" + ((ConceptClass) object).getSubclass() + "','" + keywords + "','" + characteristics + "')";
                    try {
                        Statement statement = connection.createStatement();
                        statement.executeUpdate(query);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Empty characteristics/keywords Set.");
                }
            }
            else {
                System.out.println("Invalid table name.");
            }
        }
    }
}
