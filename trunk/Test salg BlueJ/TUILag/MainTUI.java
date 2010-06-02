package TUILag;
import java.util.Scanner;

/**
 *
 * @author Anita gruppe 2, dm71
 * @date May 2010
 */
public class MainTUI
{

  //the reference to the ControlLayer
   private PersonUI perUI;//references to other UI objects
   private ProductUI prodUI;
   private SalesUI salesUIobject;
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
               startSalesMenu();
               
            }
            else{
                    if(choise == 2){
                       // startDvd();
                    }
                    else{
                        if(choise == 3){
                         //   startLaan();
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

   private void startSalesMenu()
   {
    salesUIobject = new SalesUI();
    salesUIobject.salesMenu();
   }

//       if(key == null) {
//        throw new NullPointerException(
//                        "null key in getDetails");
//    }
//    if(key.trim().length() == 0) {
//        throw new IllegalArgumentException(
//                        "Empty key passed to getDetails");
//    }


   private int writeMainMenu()
    {
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1) New sale");
            System.out.println(" (2) Products");
            System.out.println(" (3) Persons");
            System.out.println(" (4) New Login");
            System.out.print("\n Make your choise: ");

            int choise = keyboard.nextInt();
            //String asString=new String(choise);
            String asString = String.valueOf(choise);
            if(asString.trim().length() == 0)
            {
                throw new NullPointerException ("Nothing entered.. Please try again");
            }
            return choise;
    }


    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }

//     MainTUI()
//   {
//
//       mainMenuStart();

    public static void main(String[] args)
    {
        try{
        MainTUI main = new MainTUI();
        main.mainMenuStart();
        }
        catch(NullPointerException e)
        {
            
           // throw new NullPointerException("test hest");

        }
        finally
            {
                MainTUI main = new MainTUI();
                main.mainMenuStart();
            }
    
    }

//             try{
//              System.out.println(tekst + " ");
//               id = keyboard.nextLong();
//               ok = true;
//            }
//          catch (InputMismatchException ie)
//          {   System.out.println("Det skal være et tal");
//                String vent = keyboard.nextLine();
//            }
//
//


}
