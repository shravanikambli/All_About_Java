package ex27_Exceptions;

import java.util.Scanner;

public class Lab17_throw_example {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age");
        int user_age=s.nextInt();
        validate_age_for_club(user_age);
    }
    static void validate_age_for_club(int age)throws Exception{
        if(age<25){
            throw new Exception("Age can't be less than 25");
        }
        else{
            System.out.println("Enjoying clubbing");
        }
    }
}
