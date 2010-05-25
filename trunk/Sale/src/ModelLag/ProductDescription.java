/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author gruppe 2, dm71
 * @date may 2010
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
    private ItemContainer serials;

    public ProductDescription(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount, ItemContainer serials)
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
        this.serials = serials;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public int getBarCode()
    {
        return barCode;
    }

    public void setBarCode(int barCode)
    {
        this.barCode = barCode;
    }

    public double getBuyPrice()
    {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice)
    {
        this.buyPrice = buyPrice;
    }

    public int getMaxStock()
    {
        return maxStock;
    }

    public void setMaxStock(int maxStock)
    {
        this.maxStock = maxStock;
    }

    public int getMinStock()
    {
        return minStock;
    }

    public void setMinStock(int minStock)
    {
        this.minStock = minStock;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public double getSalesPrice()
    {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice)
    {
        this.salesPrice = salesPrice;
    }

    public int getShelve()
    {
        return shelve;
    }

    public void setShelve(int shelve)
    {
        this.shelve = shelve;
    }

    public Supplier getSupplier()
    {
        return supplier;
    }

    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }

    /**
     * @return the serials
     */
    public ItemContainer getSerials()
    {
        return serials;
    }

    /**
     * @param serials the serials to set
     */
    public void setSerials(ItemContainer serials)
    {
        this.serials = serials;
    }

    public String findItemSerial(String serial)
    {
        String serialNum = null;
        
        if (serials.findSerialNumber(serial).equals(serial))
        {
            serialNum = serial;
        }
        
        return serialNum;

    }

    public void addItemSerialNumber(String serial)
    {
        serials.setItemSerial(serial);
    }
 
}
