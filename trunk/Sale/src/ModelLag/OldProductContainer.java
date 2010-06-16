/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

import java.util.ArrayList;

/**
 *
 * @author Anita
 */
public class OldProductContainer
{
    private ArrayList<ProductDescription> oldStockList;
    private static OldProductContainer instance;

    /**
     * Constructs OldProductContainer
     */
    public OldProductContainer()
    {
        this.oldStockList = new ArrayList<ProductDescription>();
    }

    /**
     * @return the oldStockList
     */
    public ArrayList<ProductDescription> getOldStockList()
    {
        return oldStockList;
    }

    /**
     * @return the instance
     */
    public static OldProductContainer getInstance()
    {
        if(instance == null)
           {
              instance = new OldProductContainer();
           }//end if
        return instance;
    }

    /**
     * @param productDescrip add the productDescrip to oldStockList
     */
    public void addOldProduct(ProductDescription dp)
    {
        getOldStockList().add(dp);
    }

    /**
     * Find productDescription
     * @param barCode use barcode to find productDescription
     * @return ProductDescription of found product
     */
    public ProductDescription findProductDescription(int barCode)
    {
        ProductDescription productD = null;
        int index = 0;
        boolean found = false;
        while(index < oldStockList.size() && !found)
        {
            productD = oldStockList.get(index);
            if(productD.getBarCode() ==  barCode)
            {
                found = true;
            }//end if
            else
            {
                index++;
            }//end
        }// end while
        return productD;
    }
}
