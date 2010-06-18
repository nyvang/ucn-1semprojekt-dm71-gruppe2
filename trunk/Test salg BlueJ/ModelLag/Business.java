package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class Business extends Customer
{
    private int cvrNumber;
    private String businessName;

    /**
     * @param name name of the contact person
     * @param addres address of the business customer
     * @param phone phone of the business customer
     * @param customerID customerID of the business customer
     * @param cvrNumber CVR number of the business customer
     * @param businessName name of the business customer
     */
    public Business(String name, String addres, int phone, int customerID, int cvrNumber, String businessName)
    {
        super(name, addres, phone, customerID);
        this.cvrNumber = cvrNumber;
        this.businessName = businessName;
    }

    /**
     * @return the businessName 
     */

    public String getBusinessName()
    {
        return businessName;
    }
    
    /**
     * @param sets the businessName 
     */

    public void setBusinessName(String businessName)
    {
        this.businessName = businessName;
    }

    /**
     * @return the CVR number of the Business customer
     */

    public int getCvrNumber()
    {
        return cvrNumber;
    }

    /**
     * @param sets the cvrNumber of the business customer
     */
    public void setCvrNumber(int cvrNumber)
    {
        this.cvrNumber = cvrNumber;
    }


}
