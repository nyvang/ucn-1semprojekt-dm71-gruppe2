package ModelLag;
import java.util.ArrayList;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class SupplierContainer
{

    private ArrayList<Supplier> supplierList;
    private static SupplierContainer instance;

    /**
     * Construct class Supplier 
     */
    public SupplierContainer()
    {
        supplierList = new ArrayList<Supplier>();
    }

    /**
     * Instance - ensures singleton
     */
    public static SupplierContainer getInstance()
    {
        if(instance == null)
           {
              instance = new SupplierContainer();
            }
        return instance;
    }

     /**
     * @return the supplierList
     */
    public ArrayList<Supplier> getSupplierList()
    {
        return supplierList;
    }

    /**
     * @param newSupplier adds newSpupplier to supplierList
     */
    public void addSupplier(Supplier newSupplier)
    {
        getSupplierList().add(newSupplier);
    }

    /**
     * @param id use SupplierID to remove supplier
     */
    public Supplier removeSupplier(int id)
    {
        Supplier supObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < getSupplierList().size() && !found)
        {
           supObjekt = getSupplierList().get(index);
           if(supObjekt.getiD() == id)
           {
               found = true;
               getSupplierList().remove(index);
               System.out.println("Object removed"); //Skal fjernes
           }//end if
           else
           {
               index++;
           }//end else
        }//end while
        return null;
    }

    /**
     *  main method to test the Supplier- and SupplierContainer class
     */
     public static void main(String[] args)
     {
        SupplierContainer supContainer = SupplierContainer.getInstance();
        //create customer
        Supplier supObj1 = new Supplier("Ole", "Olegade 5", 12345678, 59595956, "Oles auto");
        supContainer.addSupplier(supObj1);
        String obj2 = supObj1.getInfo();
        System.out.println("Customer: " + obj2);
        //delete customer
        supContainer.removeSupplier(1);
    }

   

}

