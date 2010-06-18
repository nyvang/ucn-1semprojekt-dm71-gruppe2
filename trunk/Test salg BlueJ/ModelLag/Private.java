package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

/*
 * Subcalss that enherits name, address, phone and customerID from the Customer class
 */
public class Private extends Customer
{
    int cprNumber;

    /**
     * @param construct class Private with parameters
     */
    public Private(String name, String address, int phone, int customerID, int cprNumber)
    {
        super(name, address, phone, customerID);
        this.cprNumber = cprNumber;
    }

    /**
     * @return the cprNumber
     */
    public int getCprNumber()
    {
        return cprNumber;
    }

    /**
     * @param cprNumber the cprNumber to set
     */
    public void setCprNumber(int cprNumber)
    {
        this.cprNumber = cprNumber;
    }


}
