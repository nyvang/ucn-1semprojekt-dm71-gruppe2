package ControlLag;
import ModelLag.*;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class LoginCtr
{

    public LoginCtr()
    {
    }

    public Employee doLogin(int id)
    {
        Login loginNavn = new Login();
        Employee employeeObject = loginNavn.findEmployee(id);
        return employeeObject;
    }

}

