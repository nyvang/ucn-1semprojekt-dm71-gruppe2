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
     *
     * @param id
     * @return null, but finds the emlpoyee in the employeeList with "id" using a while loop
     */
    public Employee findEmployee(int id)
    {
        Employee supObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < employeeList.size() && !found)
        {
           supObjekt = employeeList.get(index);
           if(supObjekt.getAccount() == id)
           {
               employeeList.get(index);
           }//end if
            else
            {
                index++;
            }//end else
        }//end while
        return null;
    }

    /**
     *
     * @param id
     * @return null, but removes the employee with "id" from the employeeList
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
           }
           else
           {
               index++;
           }
        }
        return null;
    }
}
