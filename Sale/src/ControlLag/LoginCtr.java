package ControlLag;
import ModelLag.*;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class LoginCtr
{

    /*
     * Constructer of the LoginCtr
     */
    public LoginCtr()
    {
    }

    /*
     * Creates a new object of the Login class and calls the Login() method
     * and logs a new user into the system
     * @param id the id of the new user
     * @return employeeObject
     */
    public Employee doLogin(int id)
    {
        Login loginNavn = new Login();
        Employee employeeObject = loginNavn.findEmployee(id);
        return employeeObject;
    }

}

