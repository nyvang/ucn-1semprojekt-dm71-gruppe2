package ControlLag;
import ModelLag.*;
/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class PersonCtr
{
    private EmployeeContainer employeeCont;
    private Employee employeeObject;
    private CustomerContainer customerCont;
    private Customer customerObject;
    private SupplierContainer supplierCont;
    private Supplier supplierObject;
    private Login loginObject;

/*
 * Create
 */
 public Customer addCustomer(String name, String addres, int phone, int customerID)
 {
 
     Customer custObject = new Customer();
     custObject.setName(name);
     custObject.setAddress(addres);
     custObject.setPhone(phone);
     custObject.setCustomerID(customerID);
     customerCont.addCustomer(custObject);
     return custObject;
 }

    public Employee addEmployee(String name, String address, int phone, String userName, String password)
{
    Employee empObject = new Employee();
    empObject.setName(name);
    empObject.setAddress(address);
    empObject.setPhone(phone);
    empObject.setUserName(userName);
    empObject.setPassword(password);
    employeeCont.addEmployee(empObject);
    return empObject;
}

/*
 * Read
 */

public Employee findEmployee(String name, String userName)
{
    return null;
}


/*
 * Update
 */


/*
 * Delete
 */

}


