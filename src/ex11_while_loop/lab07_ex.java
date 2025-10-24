package ex11_while_loop;
import java.util.Scanner;
public class lab07_ex {
    public static void main(String[]args){
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number for factorial");
     if(!s.hasNextInt()){
         System.out.println("enter integer only");
     }
     else{
         int num=s.nextInt();
         int fact=1;
         if(num==0){
             System.out.println("Factorial is 1");
         }
         if(num<0||num>Integer.MAX_VALUE){
             System.out.println("Cannot have factorial of this number");
         }
         int i=1;
         while(i<=num){
             fact=fact*i;
             i++;
         }
         System.out.println(fact);
     }
    }
}
