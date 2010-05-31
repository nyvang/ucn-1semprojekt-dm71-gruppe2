package ModelLag;

/**
 *
 * @author nn119171
 */
public class Supplier extends Person {

    private int cvrNumber;
    private String businessName;
    private int iD;

    public Supplier(String name, String addres, int phone, int cvrNumber, String businessName) {
        super(name, addres, phone);
        this.cvrNumber = cvrNumber;
        this.businessName = businessName;
        iD = generateID();
    }

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



    public int getiD() {
        return iD;
    }

//    public void setiD(int iD) {
//        this.iD = iD;
//    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getCvrNumber() {
        return cvrNumber;
    }

    public void setCvrNumber(int cvrNumber) {
        this.cvrNumber = cvrNumber;
    }

    public String getInfo()
    {
        return businessName;
    }

}
