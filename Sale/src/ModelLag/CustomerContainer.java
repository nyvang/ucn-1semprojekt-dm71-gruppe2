package ModelLag;
import java.util.ArrayList;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class CustomerContainer
{

    private ArrayList<Customer> customerList;
    private static CustomerContainer instance;

    /**
     * Constructing the CustomerContainer
     */
    public CustomerContainer()
    {
        customerList = new ArrayList<Customer>();
    }

    /**
     *
     * @return instance (singleton)
     */
    public static CustomerContainer getInstance()
    {
        if(instance == null)
           {
              instance = new CustomerContainer();
           }//end if
        return instance;
    }

    /**
     *
     * @return customerList
     */
    public ArrayList<Customer> getCustomerList()
    {
        return customerList;
    }

    /**
     *
     * @param sets the customerList to this.customerList
     */
    public void setCustomerList(ArrayList<Customer> customerList)
    {
        this.customerList = customerList;
    }

    /**
     *
     * @param adds newCustomer to customerList
     */
    public void addCustomer(Customer newCustomer)
    {
        customerList.add(newCustomer);
    }

    /**
     * removes customer with this.id from the customerList using a while loop
     * @param id 
     * @return null
     */
    public Customer removeCustomer(int id)
    {
        Customer supObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < customerList.size() && !found)
        {
           supObjekt = customerList.get(index);
           if(supObjekt.getCustomerID() == id)
           {
               customerList.remove(index);
           }//end if
            else
            {
                index++;
            }//end else
        }//end while
        return null;
    }

}
