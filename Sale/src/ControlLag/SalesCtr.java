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
    private Sale salesObject;


    public SalesCtr()
    {
        salesList = SalesContainer.getInstance();
    }

    public void startNewSale(int saleID, Login clerk, Date time,
                        double subtotal, Sale quantityList)
    {
        salesObject = new Sale(clerk, time);
        newSalesLine();
        salesList.addSale(salesObject);
    }

    public void newSalesLine(int barCode)
    {
        salesObject.newSalesLine(, barCode, null)    
    }
    public double getSubtotal()
     {
        Sale subtotal = new Sale();
        return subtotal.getSubtotal();
     }

 /**
 *
 * @param Changes the login
 */
 public void alterLogin(int id)
    {
     LoginCtr newLogin = new LoginCtr();
     newLogin.doLogin(id);
    }

 /**
 *
 * @param Closes the sale, and chooses paymentmethod
 */
 public void endSale(int choice)
    {
     if(choice < 1 || choice > 3)
     {}//metoden fra SalesUI
     if(choice == 1)
        {salesObject.payForSaleCreditCard();}// end if
     if(choice == 2)
        {salesObject.payForSaleCash();}// end if
     if(choice == 3)
        {salesObject.payForSaleAccount();}// end if





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
