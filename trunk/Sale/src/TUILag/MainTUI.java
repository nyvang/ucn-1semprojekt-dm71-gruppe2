package TUILag;
import java.util.Scanner;
// import java.util.InputMismatchException;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class MainTUI
{

   private PersonUI perUI;//references to other UI objects
   private ProductUI prodUI;
   private SalesUI salesUIobject;
   private LoginUI logUI;

   public MainTUI()
   {
       mainMenuStart();
   }

   /*
    * starts the main menu and uses the user input "choise"
    */

   public void mainMenuStart()
   {
        boolean exit=false;
        while (!exit) 
        {
            int choise = writeMainMenu();
                          
            if(choise == 1)
            {
               startSalesMenu();
               
            }//end if
            else
            {
                    if(choise == 2)
                    {
                       // not implemented
                    }//end if
                    else
                    {
                        if(choise == 3)
                            {
                            // not implemented
                            }//end if
                        else
                        {
                            if(choise == 4)
                            {
                                // not implemented
                            }//end if
                                else
                                {
                                  writeEnd();
                                  exit = true;                                   
                                }//end else     
                        }
                    }// end else
             }//end else
        }//end while
        

    }//end start

   /*
    * uses the objet of the SalesUI to start the sales menu
    */

   private void startSalesMenu()
   {
    salesUIobject = new SalesUI();
    salesUIobject.salesMenu();
   }


   /*
    * starts the main menu
    * @return choise - the user input
    */
   private int writeMainMenu()
    {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1) New sale");
            System.out.println(" (2) Products");
            System.out.println(" (3) Persons");
            System.out.println(" (4) New Login");
            System.out.println(" (5) Exit");
            System.out.print("\n Make your choise: ");

            int choise = keyboard.nextInt();

            /*
             * We tried to make an input-control by converting "choise" - whitch is a primitive type -
             * to a string to measure if the input was longer than 0 chars. However we had to focus
             * our attention towards some errorcorrection in the modellayer instead.
             */
//            String asString = String.valueOf(choise);
//            if(asString == null)
//            {
//                throw new NullPointerException("Nothing entered.. Please try again");
//            }//end if
            return choise;
    }
    /*
     * Again, we tried some damage control, but we didnt get the result we wanted
     */
//   public String InputMismatchException()
//   {
//      return getMessage();
//   }
//
//   public String getMessage()
//   {
//        return "Must not be null";
//   }
    /*
     * ends the program
     */

    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }

    /*
     * Allows the system to run
     */

    public static void main(String[] args)
    {
        MainTUI main = new MainTUI();
        main.mainMenuStart();
    }


}
