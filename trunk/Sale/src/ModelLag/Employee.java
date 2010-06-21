package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

/*
 * Subclass of the Person class
 */

public class Employee extends Person
{

    private double account;
    private String userName;
    private String password;

    /**
     * @param name - name of the employee
     * @param address - address of the employee
     * @param phone - phone of the employee
     * @param account - accountnumeber of the employee
     */
    public Employee(String name, String address, int phone, int account)
    {
        super(name, address, phone);
        this.account = account;
    }
    
    /**
     * @param name - name of the employee
     * @param address - address of the employee
     * @param phone - phone of the employee
     * @param userName - username of the employee
     * @param password - the password of the employee
     */
    public Employee(String name, String address, int phone, String userName, String password)
    {
        super(name, address, phone);
        this.account = 0;
        this.userName = userName;
        this.password = password;
    }

    /**
     * Constructs class Employee without parameters
     */
    public Employee()
    {
        super();
        this.account = 0;
    }

    /**
     *
     * @return accountnumber
     */
    public double getAccount()
    {
        return account;
    }

    /**
     *
     * @param sets the account to "acount"
     */
    public void setAccount(double account)
    {
        this.account = account;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }


}
