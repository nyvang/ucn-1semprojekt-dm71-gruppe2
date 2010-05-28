/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlLag;
import ModelLag.*;

/**
 *
 * @author nn119171
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

