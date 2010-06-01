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

public class GroupContainer {

    private ArrayList<Group> groupList;
    private static GroupContainer instance;

public GroupContainer()
{
    groupList = new ArrayList<Group>();
}

public static GroupContainer getInstance()
{
    if(instance == null)
       {
          instance = new GroupContainer();
        }
    return instance;
}

public void addGroup(Group newGroup)
{
    groupList.add(newGroup);
}

public ArrayList<Group> getGroupList()
{
    return groupList;
}

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
       }
       else {
       index++;
    }
    }
    return null;
    }
}