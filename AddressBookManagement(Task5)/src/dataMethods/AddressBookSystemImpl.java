package dataMethods;

import entities.Contact;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Aryan Mehta
 */
public class AddressBookSystemImpl implements AddressBookSystem{

    databaseConnection dbConn = new databaseConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public int addContact(Contact contact) {
        return addCon(contact);
    }

    @Override
    public Contact findContact(String con_number) {
        return findCon(con_number);
    }

    @Override
    public int removeContact(String con_number) {
        return removeCon(con_number);
    }

    @Override
    public ArrayList<Contact> displayAllContacts() {
        return disCon();
    }

    @Override
    public int updateContact(Contact contact) {
        return updateCon(contact);
    }
    
    private int addCon(Contact contact){
        try {
            ps = dbConn.connection.prepareStatement("INSERT INTO contactinfo VALUES(?,?,?,?)");
            ps.setString(1, contact.getCon_number());
            ps.setString(2, contact.getCon_name());
            ps.setString(3, contact.getCon_email());
            ps.setString(4, contact.getCon_address());
            
            return ps.executeUpdate();
        } catch (Exception e) {
            return 0;
        }
    }
    
    private Contact findCon(String con_number){
        try {
            ps = dbConn.connection.prepareCall("SELECT * FROM contactinfo WHERE con_number = ?");
            ps.setString(1, con_number);
            
            rs = ps.executeQuery();
            if(rs.next()){
                Contact contact = new Contact(rs.getString("con_number"), rs.getString("con_name"),
                        rs.getString("con_email"), rs.getString("con_address"));
                return contact;
            }
        } catch (Exception e) {
            //
        }
        return null;
    }
    
    private int removeCon(String con_number){
        try {
            ps = dbConn.connection.prepareStatement("DELETE * FROM contactinfo WHERE con_number = ?");
            ps.setString(1, con_number);
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    private ArrayList<Contact> disCon(){
        ArrayList<Contact> contactList = new ArrayList<>();
        try {
            ps = dbConn.connection.prepareStatement("SELECT * FROM contactinfo");
            
            rs = ps.executeQuery();
            while(rs.next()){
                Contact contact = new Contact(rs.getString("con_number"), rs.getString("con_name"),
                        rs.getString("con_email"), rs.getString("con_address"));
                contactList.add(contact);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(contactList.isEmpty()){
            return null;
        }else{
            return contactList;
        }
    }
    
    private int updateCon(Contact contact){
        try {
            ps = dbConn.connection.prepareStatement("UPDATE contactinfo SET con_number=?,con_name=?,con_email=?,con_address=? "
                    + "WHERE con_number=?");
            ps.setString(1, contact.getCon_number());
            ps.setString(2, contact.getCon_name());
            ps.setString(3, contact.getCon_email());
            ps.setString(4, contact.getCon_address());
            ps.setString(5, contact.getCon_number());
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }   
}
