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

    /*
     * Constructer of the Sales Controler
     */
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

    /*
     * Uses the object of the sales class to start a new sale.
     * If the sales object equals null (has no value) a new sale is created. If the sales
     * object isnt null (has a value) a new sale is added (sales line)
     * @param quantity
     * @param barcode
     * @param serial
     */
    public void startNewSale(int quantity, int barCode, String serial)
    {
        if(salesObject.equals(null))
        {
            salesObject = new Sale();
            salesObject.startSale(quantity, barCode, serial);
        }//end if
        else
        {
            salesObject.startSale(quantity, barCode, serial);
        }//end else

    }

    /*
     * Adds a new sales line item to the object of the sales class
     * @param quantity
     * @param barcode
     * @param serial
     */
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
     * Creates a new object of the Sales class and calls the sale.getSubtotal() method
     * @return subtotal
     */
    public double getSubtotal()
     {
        Sale subtotal = new Sale();
        return subtotal.getSubtotal();
     }

     /**
     * Creates a new object of the LoginCtr class and calls the doLogin() method
     * @param id the id of the new user
     */
     public void alterLogin(int id)
        {
         LoginCtr newLogin = new LoginCtr();
         newLogin.doLogin(id);
        }

     /**
     * Chose the payment method
     * @param choice the choice from the SalesUI (user input)
     */
     public void endSale(int choice)
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
                salesObject.payForSaleAccount();
                salesList.addSale(salesObject);
                salesObject = null;
            }// end if

     }


    public void getCustomer()
    {

    }


}
