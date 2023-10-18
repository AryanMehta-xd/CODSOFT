package data_methods;

/**
 *
 * @author Aryan Mehta
 */
//DAO methods for ATM
public interface atmDAO {
    public int depositAmount(int amount);
    public int getBalance();
    public int withdrawAmount(int amount);
}
