package data_methods;

/**
 *
 * @author Aryan Mehta
 */
public interface atmDAO {
    public int depositAmount(int amount);
    public int getBalance();
    public int withdrawAmount(int amount);
}
