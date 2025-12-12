package ex15_StringBuffer_StringBuilder_StringFunctions;

import java.util.Scanner;

public class lab08_ex {
    public static void main(String[]args){
        // Write a program to reverse a string without using inbuilt functions.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input string,it will reverse it");
        String user_input=s.next();

        //StringBuilder b=new StringBuilder(user_input)
        //        System.out.println(stringBuilder.reverse());
        //user_input.length(),charAt();

        String reverse_user_input="";
        for(int i=user_input.length()-1;i>=0;i--){
            reverse_user_input=reverse_user_input+user_input.charAt(i);
        }
        System.out.println(reverse_user_input);

    }
}
