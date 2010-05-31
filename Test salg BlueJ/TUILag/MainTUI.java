package TUILag;
import java.util.Scanner;
import ControlLag.*;
/**
 *
 * @author nn119171
 */
public class MainTUI {

  //the reference to the ControlLayer
   private PersonUI perUI;//references to other UI objects
   private ProductUI prodUI;
   private SalesUI salesUI;
   private LoginUI logUI;

   public MainTUI()
   {

       mainMenuStart();
   }

   public void mainMenuStart()
   {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choise = writeMainMenu();
            if(choise == 1)
            {
                startAddressBook();
            }
            else{
                    if(choise == 2){
                        startDvd();
                    }
                    else{
                        if(choise == 3){
                            startLaan();
                        //start loanController
                            }//end if
                        else{
                            writeEnd();
                            exit = true;
                        }//end else
                    }// end else
             }//end else
        }//end while
    }//end start

   private int writeMainMenu()
    {
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1) User interface");
            System.out.println(" (2) Products");
            System.out.println(" (3) Sale");
            System.out.println(" (4) Login");
            System.out.print("\n Make your choise: ");

            int choise = keyboard.nextInt();

            return choise;
    }

    private void startAddressBook()
    {
        adrUI= new AddressBookUI();
        adrUI.AddressBookUIStart();


    }

    private void startDvd()
    {
        dvdUI= new DvdUI();
        dvdUI.start();

    }

    private void startLaan()
    {
        lnUI= new LoanUI();
        lnUI.start();
    }

    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }
 }
