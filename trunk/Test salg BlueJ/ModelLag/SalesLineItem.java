package ModelLag;

/**
 *
 * @author nn119171
 */
public class SalesLineItem {

    int subTotal;
    int quantity;
    int barCode;

    public SalesLineItem(int subTotal, int quantity, int barCode) {
        this.subTotal = subTotal;
        this.quantity = quantity;
        this.barCode = barCode;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

}
