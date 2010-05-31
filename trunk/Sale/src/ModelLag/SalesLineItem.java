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

    public SalesLineItem(double subTotal, int quantity, int barCode, String serial)
    {
        this.subTotal = subTotal;
        this.quantity = quantity;
        this.barCode = barCode;
        this.product = new ProductDescription();
//        this.product = findProductDescription(barCode, serial);
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

    public double getSubTotal()
    {
        return subTotal;
    }

    public void setSubTotal(int subTotal)
    {
        this.subTotal = subTotal;
    }

    public ProductDescription findProductDecription(int barCode, String serial)
    {
        ProductContainer productcont = ProductContainer.getInstance();
        ProductDescription newProd = productcont.findProductDescription(barCode, serial);
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
        subTotal = amount * (product.getSalesPrice());
        return subTotal;
    }

}
