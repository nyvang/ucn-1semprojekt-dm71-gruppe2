package ModelLag;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anita, gruppe 2, dm71
 * @date May 2010
 */
public class Sale
{

    private int saleID;
    private Login clerk;
    private Date time;
    private double subtotal;
    private ArrayList<SalesLineItem> quantitylist;
    private SalesLineItem newSalesLine;

    /**
     * @param construct class Sale with parameters
     */
    public Sale(Login clerk)
    {
        this.saleID = generateID();
        this.clerk = new Login();
        this.time = new Date();
        this.subtotal = 0;
        this.quantitylist = new ArrayList<SalesLineItem>();
        this.newSalesLine = new SalesLineItem();
    }

    /**
     * @param construct class Sale without parameters
     */
    public Sale()
    {
        this.saleID = generateID();
        this.clerk = new Login();
        this.time = new Date();
        this.subtotal = 0;
        this.quantitylist = new ArrayList<SalesLineItem>();
        this.newSalesLine = new SalesLineItem();
    }

    /**
     * @param construct class Sale with parameters
     */
    public Sale(Login clerk, Date time) //Tilføjet af NN
    {
        this.saleID = generateID();
        this.clerk = clerk;
        this.time = time;
        this.subtotal = 0;
        this.quantitylist = new ArrayList<SalesLineItem>();
        this.newSalesLine = new SalesLineItem();
    }

    /**
     * @param construct class Sale with parameters
     */
    public Sale(int quantity, int barCode, String serial)
    {
         if(getQuantitylist().size() == 0)
         {
            this.saleID = generateID();
            this.clerk = new Login();
            this.time = new Date();
            this.subtotal = 0;
            this.quantitylist = new ArrayList<SalesLineItem>();
            this.newSalesLine = newSalesLine(quantity, barCode, serial);
         }//end if
         else
         {
            this.newSalesLine = newSalesLine(quantity, barCode, serial);
         }//end else

    }

    /**
     * @return the saleID
     */
    public int getSaleID()
    {
        return saleID;
    }

    /**
     * @param saleID the saleID to set
     */
    public void setSaleID()
    {
        this.saleID = generateID();
    }

    /**
     * @return the clerk
     */
    public Login getClerk()
    {
        return clerk;
    }

    /**
     * @param clerk the clerk to set
     */
    public void setClerk(Login clerk)
    {
        this.clerk = clerk;
    }

    /**
     * @return the time
     */
    public Date getTime()
    {
        return time;
    }

    /**
     * @return the time in real time
     */
    public String getRealTime()
    {
        return time.toString();
    }

    /**
     * @param time the time to set
     */
    public void setTime(Date time)
    {
        this.time = time;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal()
    {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal)
    {
        this.subtotal = subtotal;
    }

    /**
     * @return the quantitylist
     */
    public ArrayList<SalesLineItem> getQuantitylist()
    {
        return quantitylist;
    }

    /**
     * @param quantitylist the quantitylist to set
     */
    public void setQuantitylist(ArrayList<SalesLineItem> quantitylist)
    {
        this.quantitylist = quantitylist;
    }

    /**
     * @param newID generate a new ID for this Sale
     */
    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(SalesContainer.getInstance().getSalesList().size() != 0)
        {
        index = SalesContainer.getInstance().getSalesList().size() - 1;
        Sale s = SalesContainer.getInstance().getSalesList().get(index);
        newID = s.getSaleID() + 1;
        }//end if
        else
        {
            newID = 1;
        }//end else
        return newID;
    }

    /**
     * @param quantity set the quantity in the SalesLineItem
     * @param barCode set the barCode in the SalesLineItem
     * @param serial set the serial in the SalesLineItem
     * @param newSalesLine is added to quantitylist
     * @param calulateSubTotal adds SalesLineItem subTotal to Sale subtotal
     */
    public SalesLineItem newSalesLine(int quantity, int barCode, String serial)
    {
        newSalesLine = new SalesLineItem(quantity, barCode, serial);
        getQuantitylist().add(newSalesLine);
        calculateSubTotal();
        return newSalesLine;
    }

    /**
     * @param subtotal calculate the subtotal of Sale
     */
    public double calculateSubTotal()
    {
        subtotal +=  newSalesLine.getSubTotal();
        return subtotal;
    }

    /**
     * @param
     */
    public void payForSaleCreditCard()
    {

    }

    /**
     * @param
     */
    public void payForSaleCash()
    {

    }

    /**
     * @param
     */
    public void payForSaleAccount()
    {

    }
}

