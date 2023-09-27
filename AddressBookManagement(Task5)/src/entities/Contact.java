package entities;

/**
 *
 * @author Aryan Mehta
 */
public class Contact {
    private String con_number;
    private String con_name;
    private String con_email;
    private String con_address;

    public String getCon_number() {
        return con_number;
    }

    public void setCon_number(String con_number) {
        this.con_number = con_number;
    }

    public String getCon_name() {
        return con_name;
    }

    public void setCon_name(String con_name) {
        this.con_name = con_name;
    }

    public String getCon_email() {
        return con_email;
    }

    public void setCon_email(String con_email) {
        this.con_email = con_email;
    }

    public String getCon_address() {
        return con_address;
    }

    public void setCon_address(String con_address) {
        this.con_address = con_address;
    }

    public Contact(String con_number, String con_name, String con_email, String con_address) {
        this.con_number = con_number;
        this.con_name = con_name;
        this.con_email = con_email;
        this.con_address = con_address;
    }
    
    
}
