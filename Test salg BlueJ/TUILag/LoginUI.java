package TUILag;
import java.util.Scanner;
import ControlLag.*;
import ModelLag.*;

/**
 *
 * @author Andreas
 */
public class LoginUI {

    private LoginUI logUI;


    public LoginUI getLogUI() {
        return logUI;
    }

    public void setLogUI(LoginUI logUI) {
        this.logUI = logUI;
    }


 private int loginMenu()
    {
           // creates an object keyboard to read data from the keyboard
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Login Menu ***");
            System.out.println(" (1) New Login");
            System.out.println(" (2) Return");
            System.out.print("\n Make your choise: ");

            int choise = keyboard.nextInt();
            return choise;
 }

}
