/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author Anita gruppe 2, dm71
 * @date may 2010
 */
public class SalesLineItem
{

    private double subTotal;
    private int quantity;
    private int barCode;
    private ProductDescription product;

    /**
     * @param construct class SalesLineItem with parameters
     */
    public SalesLineItem(double subTotal, int quantity, int barCode, String serial)
    {
        this.subTotal = subTotal;
        this.quantity = quantity;
        this.barCode = barCode;
        this.product = new ProductDescription();
        findProductDescription(barCode, serial);
    }

    /**
     * @param construct class SalesLineItem with parameters
     */
    public SalesLineItem(int quantity, int barCode, String serial)
    {
        this.subTotal = 0;
        this.quantity = quantity;
        this.barCode = barCode;
        this.product = new ProductDescription();
        findProductDescription(barCode, serial);
    }

    /**
     * @param construct class SalesLineItem with parameters
     */
    public SalesLineItem(int quantity, int barCode)
    {
        this.subTotal = 0;
        this.quantity = quantity;
        this.barCode = barCode;
        this.product = new ProductDescription();
    }

    /**
     * @param construct class SalesLineItem without parameters
     */
    public SalesLineItem()
    {
        this.subTotal = 0;
        this.quantity = 0;
        this.barCode = 0;
        this.product = new ProductDescription();
    }
      
     /**
     * @return the subTotal
     */
    public double getSubTotal()
    {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal)
    {
        this.subTotal = subTotal;
    }

    /**
     * @return the quantity
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
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
     * @return the product
     */
    public ProductDescription getProduct()
    {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ProductDescription product)
    {
        this.product = product;
    }

    /**
     * @param barCode the barCode to find rigth ProductDesription
     * @param serial the serial to find in ProductDesription
     */
    public ProductDescription findProductDescription(int barCode, String serial)
    {
        ProductContainer productcont = ProductContainer.getInstance();
        ProductDescription newProd = productcont.findProductDescription(barCode, serial);
        setProduct(newProd);
        return getProduct();
    }

    /**
     * @param amount calculat the subtotal using the amount to get rigth subTotal
     */
    public double calculateSubtotal(int amount)
    {
        setSubTotal(amount * (getProduct().getSalesPrice()));
        return getSubTotal();
    }


}
