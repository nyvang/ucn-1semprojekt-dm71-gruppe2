package ControlLag;
import ModelLag.*;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class LoginCtr
{
    private Employee createTestEmployee1;
    private Employee createTestEmployee2;
    private EmployeeContainer employeeList;
    /*
     * Constructer of the LoginCtr and creates test objects
     */
    public LoginCtr()
    {
        employeeList = EmployeeContainer.getInstance();
        createTestEmployee1 = new Employee("Jens Jensen", "Søvvej", 67890987, "JJ", "1234");
        employeeList.addEmployee(createTestEmployee1);
        createTestEmployee2 = new Employee("Lis Larsen", "Høvvej", 10293847, "LL", "1234");
        employeeList.addEmployee(createTestEmployee2);
    }

    /*
     * Creates a new object of the Login class and calls the Login() method
     * and logs a new user into the system
     * @param userName the userName of the new user
     * @param password the password of the new user
     * @return employeeObject
     */
    public Employee doLogin(String userName, String password)
    {
        Login loginNavn = new Login();
        Employee employeeObject = loginNavn.findEmployee(userName, password);
        return employeeObject;
    }

}

