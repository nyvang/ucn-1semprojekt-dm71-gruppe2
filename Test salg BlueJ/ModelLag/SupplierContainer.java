package ModelLag;
import java.util.ArrayList;
/**
 *
 * @author nn119171
 */


public class SupplierContainer
{

    private ArrayList<Supplier> supplierList;
    private static SupplierContainer instance;

    public SupplierContainer()
    {
        supplierList = new ArrayList<Supplier>();
    }

    public static SupplierContainer getInstance()
    {
        if(instance == null)
           {
              instance = new SupplierContainer();
            }
        return instance;
    }

    public void addSupplier(Supplier newSupplier)
    {
        supplierList.add(newSupplier);
    }

    public ArrayList<Supplier> getSupplierList()
    {
        return supplierList;
    }


     public Supplier removeSupplier(int id)
    {
        Supplier supObjekt = null;
        int index = 0;
        boolean found = false;
        while(index < supplierList.size() && !found)
        {
           supObjekt = supplierList.get(index);
           if(supObjekt.getiD() == id)
           {
               found = true;
               supplierList.remove(index);
               System.out.println("Object removed"); //Skal fjernes
           }//end if
                else {
                    index++;
                }//end else
        }//end while
        return null;
    }

     public static void main(String[] args) {
        SupplierContainer supContainer = SupplierContainer.getInstance();
        //create customer
        Supplier supObj1 = new Supplier("Ole", "Olegade 5", 12345678, 59595956, "Oles auto");
        supContainer.addSupplier(supObj1);
        String obj2 = supObj1.getInfo();
        System.out.println("Customer: " + obj2);
        //delete customer
        supContainer.removeSupplier(1);


//        //prints for test
//        System.out.println(cusObj1.getName());
//        System.out.println(cusObj1.getTotalBalance());
//        System.out.println(cusObj1.getTotalDisp());
//        accontObj.withdraw(4500);
//        System.out.println(cusObj1.getTotalBalance());
//        System.out.println(cusObj1.getTotalDisp());
    }

}