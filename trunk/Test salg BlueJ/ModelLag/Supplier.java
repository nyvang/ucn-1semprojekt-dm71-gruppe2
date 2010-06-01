package ModelLag;

/**
 *
 * @author gruppe 2, dm 71
 * @date May 2010
 */
public class Supplier extends Person
{

    private int cvrNumber;
    private String businessName;
    private int iD;

    /**
     * @param construct class Supplier with parameters
     */
    public Supplier(String name, String addres, int phone, int cvrNumber, String businessName)
    {
        super(name, addres, phone);
        this.cvrNumber = cvrNumber;
        this.businessName = businessName;
        iD = generateID();
    }

    /**
     * @return the cvrNumber
     */
    public int getCvrNumber()
    {
        return cvrNumber;
    }

    /**
     * @param cvrNumber the cvrNumber to set
     */
    public void setCvrNumber(int cvrNumber)
    {
        this.cvrNumber = cvrNumber;
    }

    /**
     * @return the businessName
     */
    public String getBusinessName()
    {
        return businessName;
    }

    /**
     * @param businessName the businessName to set
     */
    public void setBusinessName(String businessName)
    {
        this.businessName = businessName;
    }

    /**
     * @return the iD
     */
    public int getiD()
    {
        return iD;
    }

    /**
     * @param iD the iD to set
     */
//    public void setiD()
//    {
//        this.iD = generateID();
//    }

    /**
     * @param newID generate a new ID for this Supplier
     */
    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(SupplierContainer.getInstance().getSupplierList().size() != 0)
        {
            index = SupplierContainer.getInstance().getSupplierList().size() - 1;
            SupplierContainer.getInstance().getSupplierList().get(index);
            newID = getiD() + 1;
        } //end if
        else
        {
            newID = 1;
        } //end else
        return newID;
    }
  
    /**
     * @param Info find BusinessName of Supplier
     */
    public String getInfo()
    {
        return getBusinessName();
    }

    

}
