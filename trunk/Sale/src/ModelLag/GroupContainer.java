package ModelLag;
import java.util.ArrayList;
/**
* @author Gruppe 2 / DM71
* @date May 2010
*/
public class GroupContainer {

    private ArrayList<Group> groupList;
    private static GroupContainer instance;

    public GroupContainer()
    {
        groupList = new ArrayList<Group>();
    }

    /**
     *
     * @return Singleton - returns instance
     */
    public static GroupContainer getInstance()
    {
        if(instance == null)
           {
              instance = new GroupContainer();
           }
        return instance;
    }

    /**
     *
     * @param adds "newGroup" to the groupList
     */
    public void addGroup(Group newGroup)
    {
        groupList.add(newGroup);
    }

    /**
     *
     * @return the groupList
     */
    public ArrayList<Group> getGroupList()
    {
        return groupList;
    }

    /**
     *
     * @param id
     * @return null - removes a group with "id" from the groupList
     */
    public Supplier removeGroup(int id)
        {
        Group grpObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < groupList.size() && !found)
        {
           grpObjekt = groupList.get(index);
           if(grpObjekt.getId() == id)
           {
               groupList.remove(index);
               System.out.println("Object removed"); //Skal fjernes
           }//end if
            else
            {
                index++;
            }//end else
        }//end while
        return null;
        }
}