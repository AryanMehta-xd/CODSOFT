package dataMethods;

import entities.Contact;
import java.util.ArrayList;

/**
 *
 * @author Aryan Mehta
 */
//DAO methods
public interface AddressBookSystem {
    public int addContact(Contact contact);
    public Contact findContact(String con_number);
    public int removeContact(String con_number);
    public ArrayList<Contact> displayAllContacts();
    public int updateContact(Contact contact);
}
