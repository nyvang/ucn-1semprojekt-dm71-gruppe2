/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;
import java.util.ArrayList;
/**
 *
 * @author Andreas
 */
public class ItemContainer {

    private ArrayList<Item> itemList;
     private static ItemContainer serialNumber;

    public ItemContainer()
    {
        itemList = new ArrayList<Item>();
    }

    public static ItemContainer getSerialNumber()
    {
        if(serialNumber == null)
           {
              serialNumber = new ItemContainer();
            }
        return serialNumber;
    }

    public ArrayList<Item> getitemList() {
        return itemList;
    }

    public void setitemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item newItem)
    {
        itemList.add(newItem);
    }
}
