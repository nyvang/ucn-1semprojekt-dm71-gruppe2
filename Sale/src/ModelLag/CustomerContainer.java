/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

import java.util.ArrayList;
/**
 *
 * @author nn119171
 */
public class CustomerContainer {

    private ArrayList<Customer> customerList;
    private static CustomerContainer instance;

    public CustomerContainer()
    {
        customerList = new ArrayList<Customer>();
    }

    public static CustomerContainer getInstance()
    {
        if(instance == null)
           {
              instance = new CustomerContainer();
            }
        return instance;
    }

    public ArrayList<Customer> getcustomerList() {
        return customerList;
    }

    public void setcustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer newCustomer)
    {
        customerList.add(newCustomer);
    }

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
           }
           else {
           index++;
        }
        }
        return null;
    }
}
