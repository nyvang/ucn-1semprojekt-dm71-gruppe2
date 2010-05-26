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

    public Login(String name, String address, int phone, int account)
    {
        this.nameOfLogin = new Employee(name, address, phone, account);
    }
    public Login()
    {
        this.nameOfLogin = new Employee();
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
    
}
