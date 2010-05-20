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
public class SupplierContainer {

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

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public void addSupplier(Supplier newSupplier)
    {
        supplierList.add(newSupplier);
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
               supplierList.remove(index);
           }
           else {
           index++;
        }
        }
        return null;
    }
}

