package ex16_Arrays;

import java.util.Scanner;

public class lab18_ex_right_hand_reverse_triangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to print right hand reverse triangle pattern");
        int n = s.nextInt();

       for (int i = n; i >= 1; i--) {

            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }}
