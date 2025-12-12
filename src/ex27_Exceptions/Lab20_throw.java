package ex27_Exceptions;

import java.util.Scanner;

public class Lab20_throw {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        if(!a.next().equalsIgnoreCase("shravani")){
            throw new ArithmeticException("Okay");
        }
        new Object();
    }
}
