/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlLag;
import ModelLag.*;
import java.util.Date;

/**
 *
 * @author nn119171
 */
public class SalesCtr
{

    private SalesContainer salesList;

    public SalesCtr()
    {
        salesList = SalesContainer.getInstance();
    }

    public void startNewSales(int saleID, Login clerk, Date time,
                        double subtotal, Sale quantityList)
    {
        Sale salesObject = new Sale(clerk, time);
        salesList.addSale(salesObject);
    }

//     public Sale getSubtotal()
//     {
//        return subtotal;
//     }

 public void alterLogin()
    {
    }

 public void endSale()
    {

    }

 public void newSalesLine()
    {
    }

 public void payForSaleCreditCard(){
 }

 public void payForSaleCash(){
 }

 public void payForSaleAccount(){
 }

public void getCustomer(){
}


}
