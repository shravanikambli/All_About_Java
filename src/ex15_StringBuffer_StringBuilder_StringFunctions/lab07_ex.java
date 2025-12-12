package ex15_StringBuffer_StringBuilder_StringFunctions;

import java.util.Scanner;

public class lab07_ex {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the input String,it will reverse it");
        String user_input=s.next();

        String reverse_user_input="";
        char []arr=user_input.toCharArray();

        for (int i=arr.length-1;i>=0;i--){
            reverse_user_input=reverse_user_input+arr[i];
        }
        System.out.println(reverse_user_input);
    }
}
