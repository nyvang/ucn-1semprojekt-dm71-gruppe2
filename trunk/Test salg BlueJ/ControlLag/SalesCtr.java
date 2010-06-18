package ControlLag;
import ModelLag.*;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class SalesCtr
{

    private SalesContainer salesList;
    private Sale salesObject;
    private ProductDescription createTestProduct1;
    private ProductDescription createTestProduct2;
    private ProductContainer productList;

    public SalesCtr()
    {
        salesList = SalesContainer.getInstance();
        salesObject = null;
//        createTestProduct = new ProductDescription(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount);
        createTestProduct1 = new ProductDescription("Hammer", 45.67, 10, 15, 50, 1, null, 3, 2, 30);
        createTestProduct2 = new ProductDescription("Søm", 10.7, 5, 50, 100, 2, null, 7, 3, 75);
        productList = ProductContainer.getInstance();
        productList.addProductDescription(createTestProduct1);
        productList.addProductDescription(createTestProduct2);

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
        if(salesObject ==null)
        {
            salesObject = new Sale();
            salesObject.startSale(quantity, barCode, serial);
        }//end if
        else
        {
            salesObject.startSale(quantity, barCode, serial);
        }//end else

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
     public void alterLogin(String username, String password)
        {
         LoginCtr newLogin = new LoginCtr();
         newLogin.doLogin(username, password);
        }

     /**
     *
     * @param Closes the sale, and chooses paymentmethod
     */
     public void endSale(int choice, int id)
        {
         if(choice < 1 || choice > 3)
         {}//metoden fra SalesUI
         if(choice == 1)
            {
                salesObject.payForSaleCreditCard();
                salesList.addSale(salesObject);
                salesObject = null;
            }// end if
         if(choice == 2)
            {
                salesObject.payForSaleCash();
                salesList.addSale(salesObject);
                salesObject = null;
            }// end if
         if(choice == 3)
            {
                salesObject.payForSaleAccount(id);
                salesList.addSale(salesObject);
                salesObject = null;
            }// end if

     }


    public void getCustomer()
    {

    }


}
