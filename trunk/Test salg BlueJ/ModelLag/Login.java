package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class Login
{
    private Employee nameOfLogin;
    private static EmployeeContainer instance;

    /**
     * Construct class Person with parameters
     */
    public Login(String name, String address, int phone, int account)
    {
        this.nameOfLogin = new Employee(name, address, phone, account);
        instance = EmployeeContainer.getInstance();
    }

    /**
     * Construct class Person with parameters
     */
    public Login(String userName, String password)
    {
        instance = EmployeeContainer.getInstance();
        this.nameOfLogin = findEmployee(userName, password);

    }
    /**
     * Construct class Person without parameters
     */
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

    /**
     * Add employee to instance
     */
    public void addEmployee(Employee newEmployee)
    {
        instance.addEmployee(newEmployee);
    }

    /**
     * @param employeeId - find employee by using employeeId
     */
    public Employee findEmployee(String userName, String password)
    {
        Employee employee = new Employee();
        employee = instance.findEmployee(userName, password);
        return employee;
    }

}