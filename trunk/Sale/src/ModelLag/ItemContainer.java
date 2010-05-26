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

    public Item removeItem(String serial)
    {
        Item supObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < serialNumbers.size() && !found)
        {
           supObjekt = serialNumbers.get(index);
           if(supObjekt.getSerialNumber().equals(serial))
           {
               serialNumbers.remove(index);
               System.out.println("Object removed");
           }
           else 
           {
               index++;
           }
        }

        return null;
    }

//    public Supplier removeSupplier(int id)
//    {
//        Supplier supObjekt = null;
//        int index = 0;
//        boolean found = false;
//        while(index < supplierList.size() && !found)
//        {
//           supObjekt = supplierList.get(index);
//           if(supObjekt.getiD() == id)
//           {
//               supplierList.remove(index);
//               System.out.println("Object removed");
//           }
//           else {
//           index++;
//        }
//        }
//        return null;
//    }

     public static void main(String[] args)
     {
        ItemContainer supContainer = new ItemContainer();
        //create item
        Item supObj1 = new Item("12345678abc");
        supContainer.addItem(supObj1);
        String obj2 = supObj1.getSerialNumber();
        System.out.println("Itemserial : " + obj2);
        //delete item
        supContainer.removeItem("12345678abc");
     }


}
