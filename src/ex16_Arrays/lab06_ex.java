package ex16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class lab06_ex {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=s.nextInt();

        String[] numbers_marks=new String[size];

        for(int i=0;i<numbers_marks.length;i++){
            System.out.println("Enter the element->"+(i+1));
            numbers_marks[i]=s.next();
        }
        System.out.println("------Print the values");

        Arrays.sort(numbers_marks);
        for(String mark:numbers_marks){
            System.out.println(mark);
        }
    }

}
