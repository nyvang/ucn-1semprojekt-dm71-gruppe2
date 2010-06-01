/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author Anita
 */
public class Login
{
    private Employee nameOfLogin;
    private static EmployeeContainer instance;


    public Login(String name, String address, int phone, int account)
    {
        this.nameOfLogin = new Employee(name, address, phone, account);
        instance = EmployeeContainer.getInstance();
    }
    public Login()
    {
        this.nameOfLogin = new Employee();
        instance = EmployeeContainer.getInstance();
    }

    /**
     * @return the nameOfLogin
     */
    public Employee getNameOfLogin()
    {
        return nameOfLogin;
    }

    /**
     * @param nameOfLogin the nameOfLogin to set
     */
    public void setNameOfLogin(Employee nameOfLogin)
    {
        this.nameOfLogin = nameOfLogin;
    }

public void addEmployee(Employee newEmployee)
{
    instance.addEmployee(newEmployee);
}

public Employee findEmployee(int employeeId)
    {
    Employee employee = instance.findEmployee(employeeId);

        return employee;
    }
}