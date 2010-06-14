package ModelLag;
import java.util.ArrayList;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class EmployeeContainer
{

    private ArrayList<Employee> employeeList;
    private static EmployeeContainer instance;

    /**
     * Constructs EmployeeContainer witout parameters
     */
    public EmployeeContainer()
    {
        employeeList = new ArrayList<Employee>();
    }

    /**
     *
     * @return instance (singleton)
     */
    public static EmployeeContainer getInstance()
    {
        if(instance == null)
           {
              instance = new EmployeeContainer();
           }
        return instance;
    }

    /**
     *
     * @return employeeList
     */
    public ArrayList<Employee> getEmployeeList()
    {
        return employeeList;
    }

    /**
     *
     * @param sets the employeeList
     */
    public void setEmployeeList(ArrayList<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }

    /**
     *
     * @param adds newEmployee to the employeeList
     */
    public void addEmployee(Employee newEmployee)
    {
        employeeList.add(newEmployee);
    }

    /**
     * finds the emlpoyee in the employeeList using userName and password by using a while loop
     * @param userName userName of the employee
     * @param password password of the employee
     * @return Employee
     */
    public Employee findEmployee(String userName, String password)
    {
        Employee supObjekt = new Employee();
        int index = 0;
        boolean found = false;
        while(index < employeeList.size() && !found)
        {
           supObjekt = null;
           if(supObjekt.getUserName().equals(userName) && supObjekt.getPassword().equals(password))
           {
               supObjekt = employeeList.get(index);
           }//end if
            else
           {
               index++;
           }//end else
        }//end while
        return supObjekt;
    }

    /**
     * removes the employee with "id" from the employeeList
     * @param id
     * @return null
     */
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
           }//end if
           else
           {
               index++;
           }//end else
        }//end while
        return null;
    }

}
