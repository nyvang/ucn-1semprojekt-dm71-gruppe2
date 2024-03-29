package ModelLag;
import java.util.ArrayList;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class ProductContainer
{
    private ArrayList<ProductDescription> stockList;
    private String address;
    private String building;
    private static ProductContainer instance;

    /**
     * Construct class ProductContainer with parameters
     */
    private ProductContainer( String address, String building)
    {
        this.stockList = new ArrayList<ProductDescription>();
        this.address = address;
        this.building = building;
    }

    /**
     * Construct class ProductContainer without parameters
     */
    private ProductContainer()
    {
        this.stockList = new ArrayList<ProductDescription>();
        this.address = null;
        this.building = null;
    }

    /**
     * Instance - ensures singleton
     */
    public static ProductContainer getInstance()
    {
        if(instance == null)
           {
              instance = new ProductContainer();
           }//end if
        return instance;
    }


    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the building
     */
    public String getBuilding()
    {
        return building;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(String building)
    {
        this.building = building;
    }

    /**
     *@param find ProductDescription
     * @return productdescription of productD
     */
    public ProductDescription findProductDescription(int barCode)
    {
        ProductDescription productD = new ProductDescription();
        int index = 0;
        boolean found = false;
        while(index < stockList.size() && !found)
        {
            productD = stockList.get(index);
            if(productD.getBarCode() ==  barCode)// && productD.findItemSerial(serial).equals(serial))
            {
                productD = stockList.get(index);
                found = true;
            }//end if
            else
            {
                productD = new ProductDescription();
                index++;
            }//end
        }// end while
        return productD;
    }

    /**
     *@param add ProductDescription
     */
    public void addProductDescription(ProductDescription proddescr)
    {
        getStockList().add(proddescr);
    }

    /**
     * @param barCode remove the productDescription with this barcode from ProductContainer to OldProductContainer
     */
     public ProductDescription removeProductDescription(int barCode)
     {
        ProductDescription pd = new ProductDescription();
        int index = 0;
        boolean found = false;
        while(index < stockList.size() && !found)
        {
           pd = stockList.get(index);
           if(pd.getBarCode() == barCode)
           {
               OldProductContainer.getInstance().addOldProduct(pd);
               stockList.remove(index);
           }//end if
            else
            {
                index++;
            }//end else
        }//end while
        return pd;
     }

    /**
     * @return the stockList
     */
    public ArrayList<ProductDescription> getStockList()
    {
        return stockList;
    }

    /**
     * @param stockList the stockList to set
     */
    public void setStockList(ArrayList<ProductDescription> stockList)
    {
        this.stockList = stockList;
    }

    public ProductDescription updateProduct(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount)
    {
        int index = 0;
        boolean found = false;
        while(index < stockList.size() && !found)
        {
            if(stockList.get(index).getBarCode() ==  barCode)
            {
                stockList.get(index).setName(name);
                stockList.get(index).setSalesPrice(salesPrice);
                stockList.get(index).setBuyPrice(buyPrice);
                stockList.get(index).setMinStock(minStock);
                stockList.get(index).setMaxStock(maxStock);
                stockList.get(index).setBarCode(barCode);
                stockList.get(index).setSupplier(supplier);
                stockList.get(index).setRow(row);
                stockList.get(index).setShelve(shelve);
                stockList.get(index).setAmount(amount);

                found = true;
            }//end if
            else
            {
                index++;
            }//end
        }// end while
        return stockList.get(index);
    }

}
