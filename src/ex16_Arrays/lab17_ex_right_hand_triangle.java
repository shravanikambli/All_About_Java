package ex16_Arrays;

import java.util.Scanner;

public class lab17_ex_right_hand_triangle {
    public static void main(String[] args) {
        // right hand triangle pattern
        // // How the pattern we want
        //        //  n = 3
        //        //    *
        //        //   **
        //        //  ***

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to print right hand triangle pattern");
        int n=s.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                // If j is within space range → print space
                if(j <= n - i){
                    System.out.print(" ");
                }
                // Otherwise print star
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }}