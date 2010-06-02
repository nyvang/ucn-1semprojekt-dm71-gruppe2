package TUILag;
import java.util.Scanner;
import ControlLag.*;
import ModelLag.*;

/**
 *
 * @author nn119171
 */
public class SalesUI
{
        SalesCtr salesCtr = new SalesCtr();
        LoginCtr loginCtr = new LoginCtr();
//        MainTUI main = new MainTUI();
//        personCtr = new PersonCtr();
//        productCtr = new ProductCtr();

public void start()
    {
        salesMenu();
}

 public static void main(String[] args)
    {
        SalesUI sale = new SalesUI();
        sale.start();
    }

public void salesMenu()
    {
        boolean exit = false;
        while(!exit)
        {
            //show menu and return the user's choise
            int choise =   writeSalesMenu();
            if (choise == 1)
                {
                enterQuanBar();
                }
            else{if(choise == 2)
                    {
                  // enterQuanBarSer();
                    }
                    else{if(choise == 3)
                            {
                            exit = true;
                            }//end else
                        }//end if
                }//end else
        }//end while
    }

 private int writeSalesMenu()
    {
           // creates an object keyboard to read data from the keyboard
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Sales Menu ***");
            System.out.println(" (2) Enter quantity, barcode and serialnumber");
            System.out.println(" (2) End sale and choose payment method");
            System.out.println(" (3) Return");
            System.out.print("\n Make your choise: ");

            int choise = keyboard.nextInt();
            return choise;
    }

 public void enterQuanBar()
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter quantity : ");
        int newQuantity = keyboard.nextInt();
        System.out.println("Enter Barcode : ");
        int barCode = keyboard.nextInt();
        System.out.println("Enter serialnumber : ");
        String serialNumber = keyboard.nextLine();
        salesCtr.startNewSale(newQuantity, barCode, serialNumber); // skal være startNewSale
        System.out.println("Number of goods : " + salesCtr.getAmount());
        System.out.println("Subtotal : " + salesCtr.getSubtotal());
                
    }

 public void payForSale()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Choose payment method:");
        System.out.println(" (1) Credit Card");
        System.out.println(" (2) Cash");
        System.out.println(" (3) Account");
        int paymentMethod = keyboard.nextInt();
        salesCtr.endSale(paymentMethod);
    }

// public void enterQuanBarSer()
// {
//    Scanner keyboard = new Scanner(System.in);
//    System.out.println("Enter quantity : ");
//    int newQuantity = keyboard.nextInt();
//    System.out.println("Enter Barcode : ");
//    int barCode = keyboard.nextInt();
    
//    salesCtr.newSalesLine(newQuantity, barCode, serialNumber); //hvordan får vi oprettet er salg når vi mangler alle de andre variabler
// }

}
