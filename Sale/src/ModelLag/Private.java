/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author nn119171
 */
public class Private extends Customer {

    int cprNumber;

    public Private(String name, String addres, int phone, int customerID, int cprNumber) {
        super(name, addres, phone, customerID);
        this.cprNumber = cprNumber;
    }

    public int getCprNumber() {
        return cprNumber;
    }

    public void setCprNumber(int cprNumber) {
        this.cprNumber = cprNumber;
    }


}
