package dataMethods;

import java.sql.*;

/**
 *
 * @author Aryan Mehta
 */
public class databaseConnection {
    public Connection connection;
    
    public databaseConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/addressdb","root","1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
