package ex09_switch;
import java.util.Scanner;
public class lab02_ex {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day =s.nextInt();
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tue");

            case 3:
                System.out.println("wed");

            case 4:
                System.out.println("thur");

            case 5:
                System.out.println("fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

            default:
                System.out.println("Invalid ,day number");







        }
    }
}
