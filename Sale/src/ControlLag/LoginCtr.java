package ControlLag;
import ModelLag.*;

/**
 *
 * @author gruppe 2, dm71
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

