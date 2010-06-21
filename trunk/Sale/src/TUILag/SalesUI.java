package TUILag;
import java.util.Scanner;
import ControlLag.*;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class SalesUI
{
        SalesCtr salesCtr = new SalesCtr();
        LoginCtr loginCtr = new LoginCtr();
//        MainTUI main = new MainTUI();
//        personCtr = new PersonCtr();
//        productCtr = new ProductCtr();

    /*
     * starts the salesMenu method
     */

    public void start()
        {
            salesMenu();
        }

     /*
      * Main metode, starter salesUI men bruges ikke da start klassen
      * er MainUI og derfor benyttes dennes mail metode.
      */
     public static void main(String[] args)
        {
            SalesUI sale = new SalesUI();
            sale.start();
        }

     /*
      * translates the user input from writeSalesMenu()
      * and calls the specific method
      */

    public void salesMenu()
        {
            boolean exit = false;
            while(!exit)
            {
                //Translates the user input from the menu
                int choise =   writeSalesMenu();
                if (choise == 1)
                    {
                    enterQuanBar();
                    }
                else{if(choise == 2)
                        {
                      payForSale();
                        }
                        else{if(choise == 3)
                                {
                                exit = true;
                                }//end else
                            }//end if
                    }//end else
            }//end while
        }

     /*
      * Creates an object keyboard to read data from the keyboard and
      * shows all possible choices to the user
      * @return choise - the user input
      */
     private int writeSalesMenu()
        {
               //
                Scanner keyboard = new Scanner(System.in);
                System.out.println("\f *** Sales Menu ***");
                System.out.println(" (1) Enter quantity, barcode and serialnumber");
                System.out.println(" (2) End sale and choose payment method");
                System.out.println(" (3) Return");
                System.out.print("\n Make your choise: ");

                int choise = keyboard.nextInt();
                return choise;
        }


     /*
      * Method for gathering info (quantity, barcode and serialnumber)
      * to start the new sale
      */
     public void enterQuanBar()
        {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter quantity : ");
            int newQuantity = keyboard.nextInt();
            System.out.println("Enter barcode : ");
            int barCode = keyboard.nextInt();
            System.out.println("Enter serialnumber : ");
            String serialNumber = keyboard.nextLine();
            salesCtr.startNewSale(newQuantity, barCode); // skal være startNewSale
            System.out.println("Number of goods : " + salesCtr.getAmount());
            System.out.println("Subtotal : " + salesCtr.getSubtotal());

        }

     /*
      * makes the user choose the paymentmethod
      */
     public void payForSale()
        {
            int id = 0;
            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Choose payment method:");
            System.out.println(" (1) Credit Card");
            System.out.println(" (2) Cash");
            System.out.println(" (3) Account");
            int paymentMethod = keyboard.nextInt();
            salesCtr.endSale(paymentMethod, id);
        }

}
