package ex09_switch;
import java.util.Scanner;
public class lab03_ex {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day number 1 to 7");
        int day =s.nextInt();

        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tue");
                break;


        }
    }
}
