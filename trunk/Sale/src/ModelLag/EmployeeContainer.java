/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;
import java.util.ArrayList;
/**
 *
 * @author nn119171
 */
public class EmployeeContainer
{

    private ArrayList<Employee> employeeList;
    private static EmployeeContainer instance;

    public EmployeeContainer()
    {
        employeeList = new ArrayList<Employee>();
    }

    public static EmployeeContainer getInstance()
    {
        if(instance == null)
           {
              instance = new EmployeeContainer();
           }
        return instance;
    }

    public ArrayList<Employee> getEmployeeList()
    {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee newEmployee)
    {
        employeeList.add(newEmployee);
    }

     public Employee removeEmployee(int id)
    {
        Employee supObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < employeeList.size() && !found)
        {
           supObjekt = employeeList.get(index);
           if(supObjekt.getAccount() == id)
           {
               employeeList.remove(index);
           }
           else
           {
               index++;
           }
        }
        return null;
    }
}
