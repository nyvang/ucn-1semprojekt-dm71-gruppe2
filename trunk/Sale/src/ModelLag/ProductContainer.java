package ModelLag;
import java.util.ArrayList;

/**
 *
 * @author Anita gruppe 2, dm71
 * @date may 2010
 */
public class ProductContainer
{
    private ArrayList<ProductDescription> stockList;
    private String address;
    private String building;

    public ProductContainer( String address, String building) 
    {
        this.stockList = new ArrayList<ProductDescription>();
        this.address = address;
        this.building = building;
    }

    public ProductContainer() 
    {
        this.stockList = new ArrayList<ProductDescription>();
        this.address = null;
        this.building = null;
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
     */
    public ProductDescription findProductDescription(int barCode, String serial)
    {
        ProductDescription productD = null;
        int index = 0;
        boolean found = false;

        while(index < stockList.size() && !found)
        {
            productD = stockList.get(index);
            if(productD.getBarCode() ==  barCode && productD.findItemSerial(serial).equals(serial))
            {
                found = true;
            }//end if
            else
            {
                index++;
            }//end
        }
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
     * @return the stockList
     */
    public ArrayList<ProductDescription> getStockList() {
        return stockList;
    }

    /**
     * @param stockList the stockList to set
     */
    public void setStockList(ArrayList<ProductDescription> stockList) {
        this.stockList = stockList;
    }





}
