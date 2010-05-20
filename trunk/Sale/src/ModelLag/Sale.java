package ModelLag;

import java.util.ArrayList;
/**
 *
 * @author nn119171
 */
public class Sale {

    private int saleID;
    private String clerk;
    private int time;
    private int subtotal;
    private ArrayList<Sale> quantitylist;

    public Sale(int saleID, String clerk, int time, int subtotal, ArrayList<Sale> quantitylist) {
        this.saleID = saleID;
        this.clerk = clerk;
        this.time = time;
        this.subtotal = subtotal;
        this.quantitylist = quantitylist;
    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    public ArrayList<Sale> getQuantitylist() {
        return quantitylist;
    }

    public void setQuantitylist(ArrayList<Sale> quantitylist) {
        this.quantitylist = quantitylist;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


}
