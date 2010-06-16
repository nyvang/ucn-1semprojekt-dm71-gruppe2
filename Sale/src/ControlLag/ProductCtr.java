package ControlLag;

import ModelLag.ProductContainer;
import ModelLag.ProductDescription;
import ModelLag.Supplier;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class ProductCtr
{
    private ProductContainer productList;

    /**
     * Construct ProductCtr
     */
    public ProductCtr()
    {
        productList = ProductContainer.getInstance();
    }

    /**
     * Create productDescription and adding to ProductContainer
     * @param name the name of the product
     * @param salesPrice the salesPrice of the product
     * @param buyPrice the buyPrice of the product
     * @param minStock the minimun stock of the product
     * @param maxStock the maximum stock of the product
     * @param barCode the barCode of the product
     * @param supplier the supplier of the product
     * @param row the rownumber of the product
     * @param shelve the shelvenumber of the product
     * @param amount the amount of the product
     * @return ProductDesription
     */
    public ProductDescription createProductdescription(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount)
    {
        ProductDescription pd = new ProductDescription();
        pd.setName(name);
        pd.setSalesPrice(salesPrice);
        pd.setBuyPrice(buyPrice);
        pd.setMinStock(minStock);
        pd.setMaxStock(maxStock);
        pd.setBarCode(barCode);
        pd.setSupplier(supplier);
        pd.setRow(row);
        pd.setShelve(shelve);
        pd.setAmount(amount);
        productList.addProductDescription(pd);
        return pd;
    }

    /**
     * Find ProductDesription
     * @param barCode the barCode of the product
     * @param serial the serial of the product
     * @return ProductDesription
     */
    public ProductDescription findProductdescription(int barCode, String serial)
    {
        return productList.findProductDescription(barCode, serial);
    }

    /**
     * Updating existing productDescription
     * @param name the name of the product
     * @param salesPrice the salesPrice of the product
     * @param buyPrice the buyPrice of the product
     * @param minStock the minimun stock of the product
     * @param maxStock the maximum stock of the product
     * @param barCode the barCode of the product
     * @param supplier the supplier of the product
     * @param row the rownumber of the product
     * @param shelve the shelvenumber of the product
     * @param amount the amount of the product
     * @return ProductDesription
     */
    public ProductDescription updateProductDescription(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount)
    {
        return productList.updateProduct(name, salesPrice, buyPrice, minStock, maxStock, barCode, supplier, row, shelve, amount);
    }

    /**
     * Remove ProductDesription from ProductContainer and adding to OldProductContainer
     * @param barCode the barcode of the ProductDesription
     * @return ProductDesription
     */
    public ProductDescription removeProductDescription(int barCode)
    {
        return productList.removeProductDescription(barCode);
    }
}
