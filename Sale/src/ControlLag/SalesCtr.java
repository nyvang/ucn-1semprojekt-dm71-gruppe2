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
    private ProductDescription createTestProduct;

    public SalesCtr()
    {
        salesList = SalesContainer.getInstance();
        
    }

//    public void createProduct(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount)
//    {
//        createTestProduct.ProductDescription("Brækjern", 45.42, 20.14, 5, 9, 123, null, 3, 4, 1);
//    }
    
////    public void startNewSale(int saleID, Login clerk, Date time,
////                        double subtotal, Sale quantityList, int quantity, int barCode, String serial)
////    {
////        salesObject = new Sale(quantity, barCode, serial);
////        newSalesLine(quantity, barCode, serial);
////        salesList.addSale(salesObject);
////    }

    public void startNewSale(int quantity, int barCode, String serial)
    {
        salesObject = new Sale(quantity, barCode, serial);
        newSalesLine(quantity, barCode, serial);
        salesList.addSale(salesObject);

    }

    public void newSalesLine(int quantity, int barCode, String serial)
    {
        salesObject.newSalesLine(quantity, barCode, serial);
    }

    /**
     * @return the number of items in the salesList
     */
    public int getAmount()
        {
            return salesObject.getQuantitylist().size();
        }
    /**
     *
     * comment
     */
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
            {salesObject.payForSaleCreditCard();
            }// end if
         if(choice == 2)
            {salesObject.payForSaleCash();
            }// end if
         if(choice == 3)
            {salesObject.payForSaleAccount();
            }// end if

     }


    public void getCustomer()
    {

    }


}
