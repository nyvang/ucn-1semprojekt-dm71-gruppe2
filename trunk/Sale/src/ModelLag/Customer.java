package ModelLag;
/**
* @author Gruppe 2 / DM71
* @date May 2010
*/
public class Customer extends Person
{

    private int customerID;
    private Group group;

    /**
     * @param name - name of the customer
     * @param addres - adress of the customer
     * @param phone - phone of the customer
     * @param customerID - ID of the customer
     */
    public Customer(String name, String addres, int phone, int customerID)
    {
        super(name, addres, phone);
        this.customerID = customerID;
    }

    /**
     * @return the customerID
     */
    public int getCustomerID()
    {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    /**
     * @return the group
     */
    public Group getGroup()
    {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(Group group)
    {
        this.group = group;
    }  
}
