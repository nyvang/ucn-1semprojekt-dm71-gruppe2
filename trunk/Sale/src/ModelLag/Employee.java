/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author nn119171
 */
public class Employee extends Person {

    int account;

    public Employee(String name, String addres, int phone, int account) {
        super(name, addres, phone);
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }


}
