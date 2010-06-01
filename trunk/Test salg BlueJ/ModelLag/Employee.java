package ModelLag;
/**
* @author Gruppe 2 / DM71
* @date May 2010
*/
public class Employee extends Person {

    private int account;
    private String userName;
    private String password;

    /**
     *
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

    public Employee()
    {
        super();
        this.account = 0;
    }

    /**
     *
     * @return accountnumber
     */
    public int getAccount()
    {
        return account;
    }

    /**
     *
     * @param sets the account to "acount"
     */
    public void setAccount(int account)
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
