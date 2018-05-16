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

    public Concept search(String word) {
        Concept obj = new Concept();
        String query = "SELECT * FROM concepts WHERE LOWER(key_concept) LIKE BINARY '" + word.toLowerCase() + "'"; // the query [like binary is some sort of =]
        try { //try to execute the query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) { //if there is a result then update the concept with name, url, etc..
                obj.setFoundInDB(true);
                obj.setName(resultSet.getString("key_concept"));
                obj.setUrl(resultSet.getString("link"));
                obj.setConceptSubclass(resultSet.getString("subclass"));
                ConceptClass conceptClass = new ConceptClass(resultSet.getString("class"));
                String[] keys = resultSet.getString("characteristics").split(",");
                conceptClass.setCharacteristics(new TreeSet<>(Arrays.asList(keys)));
                obj.setConceptClass(conceptClass);
            }
        }
        catch(java.sql.SQLException e) {
            System.err.println("SQL exception: " + e);
        }
        return obj;
    }

    public void add(Concept concept) {
        if(!concept.getCharacteristics().isEmpty()) {
            String characteristics = "";
            for (String characteristic : concept.getCharacteristics()) { //traverse Set of characteristics and add them in characteristics String
                if (!characteristic.equals("") && !characteristic.equals(null))
                    characteristics += characteristic + ",";
            }
            characteristics = characteristics.substring(0, characteristics.length() - 1);

            String query = "INSERT INTO concepts (key_concept, class, subclass, characteristic, link) " +
                    "       VALUES " +
                    "       ('" + concept.getName() + "','" + concept.getConceptClass().getNameClass() + "','" + concept.getConceptSubclass() + "','" + characteristics + "','" + concept.getUrl() + "')";
            try {
                Statement statement = connection.createStatement();
                int resultSet = statement.executeUpdate(query);
                if (resultSet == 1) {
                    concept.setFoundInDB(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Empty characteristics Set.");
        }
    }
}
