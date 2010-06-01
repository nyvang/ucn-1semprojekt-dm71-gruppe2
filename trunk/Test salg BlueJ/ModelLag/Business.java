/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author nn119171
 */
public class Business extends Customer {

    int cvrNumber;
    String businessName;

    public Business(String name, String addres, int phone, int customerID, int cvrNumber, String businessName) {
        super(name, addres, phone, customerID);
        this.cvrNumber = cvrNumber;
        this.businessName = businessName;
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


}
