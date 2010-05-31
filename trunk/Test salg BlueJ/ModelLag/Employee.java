package ModelLag;

/**
 *
 * @author nn119171
 */
public class Employee extends Person {

    private int account;
    private String userName;
    private String password;

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


    public int getAccount()
    {
        return account;
    }

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
