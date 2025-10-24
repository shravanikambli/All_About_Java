package ex09_switch;
import java.util.Scanner;
public class lab04_ex {
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the name of browser");
        String browser=s.next();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox();
                break;

            case "edge":
                System.out.println("Execute the edge code");
                break;
            default :
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}
