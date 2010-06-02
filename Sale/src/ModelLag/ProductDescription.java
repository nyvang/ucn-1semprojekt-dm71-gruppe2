package ModelLag;
import java.util.ArrayList;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class ProductDescription
{
    private String name;
    private double salesPrice;
    private double buyPrice;
    private int minStock;
    private int maxStock;
    private int barCode;
    private Supplier supplier;
    private int row;
    private int shelve;
    private int amount;
    private ArrayList<Item> serials;

    /**
     * Construct class ProductDescription with parameters
     */
    public ProductDescription(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount)
    {
        this.name = name;
        this.salesPrice = salesPrice;
        this.buyPrice = buyPrice;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.barCode = barCode;
        this.supplier = supplier;
        this.row = row;
        this.shelve = shelve;
        this.amount = amount;
        this.serials = new ArrayList<Item>();
    }

    /**
     * Construct class ProductDescription without parameters
     */
    public ProductDescription()
    {
        this.name = null;
        this.salesPrice = 0;
        this.buyPrice = 0;
        this.minStock = 0;
        this.maxStock = 0;
        this.barCode = 0;
        this.supplier = null;
        this.row = 0;
        this.shelve = 0;
        this.amount = 0;
        this.serials = null;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the salesPrice
     */
    public double getSalesPrice()
    {
        return salesPrice;
    }

    /**
     * @param salesPrice the salesPrice to set
     */
    public void setSalesPrice(double salesPrice)
    {
        this.salesPrice = salesPrice;
    }

    /**
     * @return the buyPrice
     */
    public double getBuyPrice()
    {
        return buyPrice;
    }

    /**
     * @param buyPrice the buyPrice to set
     */
    public void setBuyPrice(double buyPrice)
    {
        this.buyPrice = buyPrice;
    }

    /**
     * @return the minStock
     */
    public int getMinStock()
    {
        return minStock;
    }

    /**
     * @param minStock the minStock to set
     */
    public void setMinStock(int minStock)
    {
        this.minStock = minStock;
    }

    /**
     * @return the maxStock
     */
    public int getMaxStock()
    {
        return maxStock;
    }

    /**
     * @param maxStock the maxStock to set
     */
    public void setMaxStock(int maxStock)
    {
        this.maxStock = maxStock;
    }

    /**
     * @return the barCode
     */
    public int getBarCode()
    {
        return barCode;
    }

    /**
     * @param barCode the barCode to set
     */
    public void setBarCode(int barCode)
    {
        this.barCode = barCode;
    }

    /**
     * @return the supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }

    /**
     * @return the row
     */
    public int getRow()
    {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row)
    {
        this.row = row;
    }

    /**
     * @return the shelve
     */
    public int getShelve()
    {
        return shelve;
    }

    /**
     * @param shelve the shelve to set
     */
    public void setShelve(int shelve)
    {
        this.shelve = shelve;
    }

    /**
     * @return the amount
     */
    public int getAmount()
    {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    /**
     * @return the serials
     */
    public ArrayList<Item> getSerials()
    {
        return serials;
    }

    /**
     * @param serials sets the serialnumbers in the ArrayList
     */
    public void setSerialNumbers(ArrayList<Item> serials)
    {
        this.serials = serials;
    }

    /**
     * @param adds item "i" to the serialnumber list
     */
    public void addItem(Item i)
    {
        getSerials().add(i);
    }

    /**
     * @param serial find out if the serial is correct
     */
    public String findItemSerial(String serialNum)
    {
        String serial = null;
        for (Item serialNums : serials)
        {
            if(serialNums.getSerialNumber().equals(serialNum))
            {
                serial = serialNum;
            }//end if
        }//end for
        return serial;
    }

    /**
     * @param serial - adds serialitem i to the serials list
     */
    public void setItemSerial(String serial)
    {
        Item i = new Item(serial);
        addItem(i);
    }

    /**
     * @param serial add the serial to the ItemContainer serials
     */
    public void addItemSerialNumber(String serial)
    {
        setItemSerial(serial);
    }
 
}
