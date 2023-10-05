package data_methods;

import java.sql.*;

/**
 *
 * @author Aryan Mehta
 */
public class atmDAOimpl implements atmDAO{
    private dbConn db = new dbConn();
    private PreparedStatement ps;
    private ResultSet rs; 
    
    
    public int depositAmount(int amount) {
        return depAmount(amount);
    }

    @Override
    public int getBalance() {
        return getBal();
    }

    @Override
    public int withdrawAmount(int amount) {
        return withDAmt(amount);
    }
    
    private int depAmount(int amount){
        int balance=0;
        try {
            balance = getBalance();
            
            balance+=amount;
            ps = db.con.prepareStatement("UPDATE clientData SET acc_balance = ? WHERE acc_number = ?");
            ps.setInt(1, balance);
            ps.setString(2, "8624970236");
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    private int getBal(){
        try {
            ps = db.con.prepareStatement("SELECT acc_balance FROM clientData WHERE acc_number = ?");
            ps.setString(1, "8624970236");
            
            rs = ps.executeQuery();
            
            return rs.getInt("acc_balance");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    private int withDAmt(int amount){
        int balance;
        try {
            balance = getBalance();
            
            if(amount>balance){
                return 0;
            }else{
                balance = balance-amount;
                
                ps = db.con.prepareStatement("UPDATE clientData SET acc_balance = ? WHERE acc_number = ?");
                ps.setInt(1, balance);
                ps.setString(2, "8624970236");
                
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
