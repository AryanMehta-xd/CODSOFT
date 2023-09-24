package data_methods;

import java.sql.*;

/**
 *
 * @author Aryan Mehta
 */
public class db_conn {
    public Connection con;
    
    public db_conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atmDB","root","1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
