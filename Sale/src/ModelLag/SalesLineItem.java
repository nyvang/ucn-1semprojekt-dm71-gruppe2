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

    private int subTotal;
    private int quantity;
    private int barCode;
    private ProductDescription product;

    public SalesLineItem(int subTotal, int quantity, int barCode)
    {
        this.subTotal = subTotal;
        this.quantity = quantity;
        this.barCode = barCode;
        this.product = new ProductDescription();
    }
    
    public SalesLineItem(int quantity, int barCode)
    {
        this.subTotal = 0;
        this.quantity = quantity;
        this.barCode = barCode;
        this.product = new ProductDescription();
    }

    public SalesLineItem()
    {
        this.subTotal = 0;
        this.quantity = 0;
        this.barCode = 0;
        this.product = new ProductDescription();
    }
    
    public int getBarCode()
    {
        return barCode;
    }

    public void setBarCode(int barCode)
    {
        this.barCode = barCode;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getSubTotal()
    {
        return subTotal;
    }

    public void setSubTotal(int subTotal)
    {
        this.subTotal = subTotal;
    }

    public ProductDescription findProductDecription(int barCode, String serial)
    {
        ProductDescription newProd == ProductContainer().findProductDescription(barCode, serial);
        product = newProd;
        return product;
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

    public double calculateSubtotal(int amount, int barCode, String serial)
    {
        subTotal = amount * (findProductDescription().getSalesPrice());
        return subTotal;
    }

}
