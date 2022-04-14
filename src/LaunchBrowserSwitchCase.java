import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class LaunchBrowserSwitchCase {
    public static void main(String[] args) {

         //Reading input from console we are using scanner class
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a string: ");
        String str= sc.nextLine(); //reads string.
        LaunchBrowserSwitchCase lbrowser = new LaunchBrowserSwitchCase();

        if (lbrowser.launchbrowser(str)) {
            System.out.println("enter the url: ");
        }

        /*if(lbrowser.launchbrowser("chrome"))
        {
            System.out.println("enter the url: ");
        }
       if(lbrowser.launchbrowser("ie")){
           System.out.println("enter the url: ");
       }
        if(lbrowser.launchbrowser("firefox")){
            System.out.println("enter the rul: ");
        }

        if(lbrowser.launchbrowser("safari"));{
            System.out.println("entered the url: ");
        }

            System.out.println("browser not available");
            */


    }



    public boolean launchbrowser(String browser) {
        switch (browser.toLowerCase()) {

            case "chrome":
                System.out.println("Launching the chrome browser");
                 //break;
                 return true;
            case "ie":
                System.out.println("Launching the IE browser");
                //break;
                return true;

            case "firefox":
                System.out.println("Launching the Firefox browser");
                //break;
                return true;

            case "safari":
                System.out.println("Launching the  safari browser ");
               // break;
            return true;

            default:
                System.out.println("browser not found: " +browser);
                //break;
                return false;

        }

        //return browser;
    }
}
