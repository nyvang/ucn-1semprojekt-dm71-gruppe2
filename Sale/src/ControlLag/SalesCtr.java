/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlLag;
import ModelLag.*;

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

public void startNewSales(int saleID, Login clerk, int time,
                        double subtotal, Sale quantityList)
{
    Sale salesObject = new Sale(ID, clerk, time, subtotal, quantityList);
    salesList.addSale(salesObject);
}


//    public LoanCtr()
//    {
//        loanSamling = LoanCollection.getInstance();
//        dvdCol = DVDCollection.getInstance();
//        personCol = PersonCollection.getInstance();
//
//    }
//
//    public void createLoan(int id, int date, String period,
//                Person personObject, Specimen specimenObject)
//    {
//        Loan loanObject = new Loan(id, date, period, personObject, specimenObject);
//        loanSamling.addLoan(loanObject);
//    }
//

 public void startNewSales()
    {

    }

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
