package ex16_Arrays;

import java.util.Scanner;

public class lab16_ex_left_hand_reverse_triangle {
    public static void main(String[] args) {
        // left hand reverse triangle pattern
        // // How the pattern we want
        //        // ***
        //        // **
        //        // *
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number to print right hand triangle");
        int n = s.nextInt();

        for (int i = 1; i <=n; i++) {
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//