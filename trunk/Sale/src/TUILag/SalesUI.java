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
        salesCtr = new salesCtr();
        personCtr = new PersonCtr();
        productCtr = new ProductCtr();


public void start()
    {
        salesMenu();
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
                startNewSale();
            }
            else{if(choise == 2){
                   alterLogin();
                }
                else{
                    exit = true;
                }
                }//end else
            }//end else

        }//end while


 private int writeSalesMenu()
    {
           // creates an object keyboard to read data from the keyboard
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Sales Menu ***");
            System.out.println(" (1) New Sale");
            System.out.println(" (2) Change salesman");
            System.out.println(" (3) Return");
            System.out.print("\n Make your choise: ");

            int choise = keyboard.nextInt();
            return choise;
    }

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
