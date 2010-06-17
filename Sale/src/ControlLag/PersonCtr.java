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

public void addEmployee()
{
    if(EmployeeContainer.getInstance() != null)
        {
        employeeCont.addEmployee(employeeObject);
        }
    else
        {
        employeeCont.setEmployeeList(null);
        }
}





}


