/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author nn119171
 */
public class Supplier extends Person {

    private int cvrNumber;
    private String businessName;
    private int iD;

    public Supplier(String name, String addres, int phone, int cvrNumber, String businessName, int iD) {
        super(name, addres, phone);
        this.cvrNumber = cvrNumber;
        this.businessName = businessName;
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

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
