/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;
import java.util.ArrayList;

/**
 *
 * @author Gruppe 2, dm71
 * @date May 2010
 */
public class ItemContainer
{
    private ArrayList<Item> serialNumbers;

    public ItemContainer()
    {
        serialNumbers = new ArrayList<Item>();
    }

    /**
     * @return the serialNumbers
     */
    public ArrayList<Item> getSerialNumbers()
    {
        return serialNumbers;
    }

    /**
     * @param serialNumbers the serialNumbers to set
     */
    public void setSerialNumbers(ArrayList<Item> serialNumbers)
    {
        this.serialNumbers = serialNumbers;
    }

    public void addItem(Item i)
    {
        getSerialNumbers().add(i);
    }

    public void setItemSerial(String serial)
    {
        Item i = new Item(serial);

        addItem(i);
    }

    public String findSerialNumber(String serialNum)
    {
        String serial = null;
        for (Item serialNums : serialNumbers)
        {
            if(serialNums.getSerialNumber().equals(serialNum))
            {
                serial = serialNum;
            }
        }
        return serial;
    }


}
