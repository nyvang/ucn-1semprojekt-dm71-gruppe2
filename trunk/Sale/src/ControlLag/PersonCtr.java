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
    //private Supplier supplierObject;
    private Login loginObject;

/*
 * Create
 */
 public Customer addCustomer(String name, String addres, int phone, int customerID)
 {
 
     Customer custObject = new Customer(name,addres,phone,customerID);
     customerCont.addCustomer(custObject);//.addCustomer(custObject);
     return custObject;
 }

 public int getID()
 {
    return customerObject.getCustomerID();
 }

 public Customer findCustomer(int id)
 {
    return customerCont.findCustomer(id);

 }

 public Customer removeCustomer(int id)
 {
    return customerCont.removeCustomer(id);
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

public Employee findEmployee(String userName)
{
    return employeeCont.findEmployee(userName);
}

public Employee removeEmployee(int id)
{
    return employeeCont.removeEmployee(id);
}

public Supplier addSupplier(String name, String addres, int phone, int cvrNumber, String businessName)
{
    Supplier supObject = new Supplier(name, addres, phone, cvrNumber, businessName);
    supplierCont.addSupplier(supObject);
    return supObject;
}

public Supplier removeSupplier(int id)
{
    return supplierCont.removeSupplier(id);
}


/*
 * Delete
 */

}


