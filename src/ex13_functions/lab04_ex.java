package ex13_functions;

import java.util.Scanner;

public class lab04_ex {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the a");
        int a=s.nextInt();
        System.out.println("Enter the b");
        int b=s.nextInt();

        int result=sum_of_two_num(a,b);
        int result2=sum_of_two_num(37,6);
        int result3=sum_of_two_num(57,9);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
    static int sum_of_two_num(int a,int b){
        return a+b;
    }
    static void sum_of_two_num(){
        System.out.println("Hi,There");
    }
}
