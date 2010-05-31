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

    public Sale(Login clerk)
    {
        this.saleID = generateID();
        this.clerk = new Login();
        this.time = new Date();
        this.subtotal = 0;
        this.quantitylist = new ArrayList<SalesLineItem>();
        this.newSalesLine = new SalesLineItem();
    }

    public Sale()
    {
        this.saleID = generateID();
        this.clerk = new Login();
        this.time = new Date();
        this.subtotal = 0;
        this.quantitylist = new ArrayList<SalesLineItem>();
        this.newSalesLine = new SalesLineItem();
    }

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

    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(SalesContainer.getInstance().getSalesList().size() != 0)
        {
        index = SalesContainer.getInstance().getSalesList().size() - 1;
        Sale s = SalesContainer.getInstance().getSalesList().get(index);
        newID = s.getSaleID() + 1;
        }
        else
        {
            newID = 1;
        }
        return newID;
    }

    public SalesLineItem newSalesLine(int quantity, int barCode, String serial)
    {
        newSalesLine = new SalesLineItem(quantity, barCode);
        return newSalesLine;
    }

    public double calculateSubbTotal()
    {
        subtotal +=  newSalesLine.getSubTotal();
        return subtotal;
    }
}

