package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aryan Mehta
 */
public class db_conn {
    public Connection db_con;
    
    public db_conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            db_con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentmanagement","root","1234");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
