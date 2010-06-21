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
    private ProductDescription createTestProduct3;
    private ProductContainer productList;
    private CustomerContainer customerList;
    private Private createPrivateTestCustomer;
    private Business createBusinessTestCustomer;
    private Supplier createTestSupplier;
    private SupplierContainer supplierList;
    private Employee createTestEmployee1;
    private Employee createTestEmployee2;
    private EmployeeContainer employeeList;
    

    /*
     * Constructer of the Sales Controller
     */
    public SalesCtr() 
    {
        employeeList = EmployeeContainer.getInstance();
        createTestEmployee1 = new Employee("Jens Jensen", "Søvvej", 67890987, "jj", "1234");
        employeeList.addEmployee(createTestEmployee1);
        createTestEmployee2 = new Employee("Lis Larsen", "Høvvej", 10293847, "ll", "1234");
        employeeList.addEmployee(createTestEmployee2);
        salesList = SalesContainer.getInstance();
        salesObject = new Sale();
        createTestSupplier = new Supplier("Hans Ibsen", "Hejvej 10", 34567890, 234567, "Ibsen's depot");
//        createTestProduct = new ProductDescription(String name, double salesPrice, double buyPrice, int minStock, int maxStock, int barCode, Supplier supplier, int row, int shelve, int amount);
        createTestProduct1 = new ProductDescription("Hammer", 45.67, 10, 15, 50, 1, createTestSupplier, 3, 2, 30);
        createTestProduct2 = new ProductDescription("Søm", 10.7, 5, 50, 100, 2, createTestSupplier, 7, 3, 75);
        createTestProduct3 = new ProductDescription("Brædder", 15.25, 6.25, 100, 1000, 3, createTestSupplier, 10, 1, 550);
        productList = ProductContainer.getInstance();
        productList.addProductDescription(createTestProduct1);
        productList.addProductDescription(createTestProduct2);
        productList.addProductDescription(createTestProduct3);
        customerList = CustomerContainer.getInstance();
        createPrivateTestCustomer = new Private("Ib","Bo",12345678, 12345678, 1234);
        createBusinessTestCustomer = new Business("Kaj","Mole", 87654321, 87654321, 8907, "Kaj's Corner");
        customerList.addCustomer(createPrivateTestCustomer);
        customerList.addCustomer(createBusinessTestCustomer);
        supplierList = SupplierContainer.getInstance();
        supplierList.addSupplier(createTestSupplier);
    }

    /*
     * Uses the object of the sales class to start a new sale.
     * If the sales object equals null (has no value) a new sale is created. If the sales
     * object isnt null (has a value) a new sale is added (sales line)
     * @param quantity
     * @param barcode
     * @param serial
     */
    public Sale startNewSale(int quantity, int barCode, String serial)
    {
        if(salesObject.getSaleID() == 0) 
        {
            salesObject = new Sale();
            salesObject.startSale(quantity, barCode, serial);
        }//end if
        else
        {
            salesObject.startSale(quantity, barCode, serial);
        }//end else
        return salesObject;
    }

    /*
     * Adds a new sales line item to the object of the sales class
     * @param quantity
     * @param barcode
     * @param serial
     */
    public Sale newSalesLine(int quantity, int barCode, String serial)
    {
        salesObject.newSalesLine(quantity, barCode, serial);
        return salesObject;
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
     * @param userName the username of the new user
     * @param password the password of the new user
     */
     public Employee alterLogin(String userName, String password)
        {
         Employee login = new Employee();
         LoginCtr newLogin = new LoginCtr();
         login = newLogin.doLogin(userName, password);
         return login;
        }

     /**
     * Chose the payment method
     * @param choice the choice from the SalesUI (user input)
     */
     public Sale endSale(int choice ,int id)
     {
         Sale endSale = new Sale();

         if(choice < 1 || choice > 3)
         {
             endSale = salesObject;
         }//metoden fra SalesUI
         if(choice == 1)
            {
                
                salesObject.payForSaleCreditCard();
                endSale = salesObject;
                salesList.addSale(salesObject);
                salesObject.clearAll();
                salesObject = null;
            }// end if
         if(choice == 2)
            {
                salesObject.payForSaleCash();
                endSale = salesObject;
                salesList.addSale(salesObject);
                salesObject = null;
            }// end if
         if(choice == 3)
            {
                salesObject.payForSaleAccount(id);
            endSale = salesObject;
            salesList.addSale(salesObject);
            salesObject = null;
            }// end if
         return endSale;
     }

    public Sale payForSaleAccount(int id)
    {
//        Customer c = new Customer();
//        c = salesObject.payForSaleAccount(int id);
//        if(c != null)
//        {
//            salesObject.payForSaleAccount();
//            endSale = salesObject;
//            salesList.addSale(salesObject);
//            salesObject = null;
//        }
       return salesObject;
    }


    public void getCustomer()
    {

    }


}
