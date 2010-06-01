package ModelLag;
import java.util.ArrayList;
/**
* @author Gruppe 2 / DM71
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
     * @param sets the serialnumbers in the ArrayList
     */
    public void setSerialNumbers(ArrayList<Item> serialNumbers)
    {
        this.serialNumbers = serialNumbers;
    }
/**
 *
 * @param adds item "i" to the serialnumber list
 */
    public void addItem(Item i)
    {
        getSerialNumbers().add(i);
    }
    /**
     *
     * @param sets the "serial" to the item "i"
     */
    public void setItemSerial(String serial)
    {
        Item i = new Item(serial);

        addItem(i);
    }

    /**
     *
     * @param for-each loop that searches for "serialNum" in serialNumbers-list
     * @return the specific serialnumber if found
     */
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

    /**
     *
     * @param while-loop that searches for "serial" in the serialNumbers-list
     * @return the serial if found
     */
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

    /**
     *
     * @param main method, that allow testing of this class (ItemContainer) and the Item class
     */
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
