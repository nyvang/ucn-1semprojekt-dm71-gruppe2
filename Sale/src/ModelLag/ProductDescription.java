/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author nn119171
 */
public class ProductDescription {

    String name;
    int salesPrice;
    int buyPrice;
    int minStock;
    int maxStock;
    int barCode;
    String supplier;
    int row;
    int shelve;
    int amount;

    public ProductDescription(String name, int salesPrice, int buyPrice, int minStock, int maxStock, int barCode, String supplier, int row, int shelve, int amount) {
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
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getShelve() {
        return shelve;
    }

    public void setShelve(int shelve) {
        this.shelve = shelve;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }


}
