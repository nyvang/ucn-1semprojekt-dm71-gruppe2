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
public class ItemContainer
{

    private ArrayList<Item> itemList;
    
    public ItemContainer()
    {
        itemList = new ArrayList<Item>();
    }

   
    public ArrayList<Item> getitemList()
    {
        return getItemList();
    }

    public void setItemList(ArrayList<Item> itemList)
    {
        this.itemList = itemList;
    }

    /**
     * @return the itemList
     */
    public ArrayList<Item> getItemList()
    {
        return itemList;
    }

    public void addItem(Item newItem)
    {
        getItemList().add(newItem);
    }

    
}
