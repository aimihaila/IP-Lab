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

    public Concept search(String word) {
        Concept obj = new Concept();
        String query = "SELECT * FROM concepts WHERE concept_key LIKE BINARY '" + word + "'"; // the query [like binary is some sort of =]
        try { //try to execute the query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) { //if there is a result then update the concept with name, url, etc..
                obj.setFoundInDB(true);
                obj.setName(resultSet.getString("concept_name"));
                obj.setUrl(resultSet.getString("concept_url"));
                ConceptClass conceptClass = new ConceptClass(resultSet.getString("concept_class_name"));
                String[] keys = resultSet.getString("concept_class_keywords").split(",");
                Set<String> keywords = new TreeSet<>(Arrays.asList(keys));
                conceptClass.setKeywords(keywords);
                obj.setConceptClass(conceptClass);
            }
        }
        catch(java.sql.SQLException e) {
            System.err.println("SQL exception: " + e);
        }
        return obj;
    }

    // TODO: the add function
}
