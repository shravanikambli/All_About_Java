package ex16_Arrays;

import java.util.Scanner;

public class lab15_ex_left_hand_triangle {
    public static void main(String[] args){
        // left hand triangle pattern
        // // How the pattern we want
        //        //  n = 3
        //        // *
        //        // **
        //        // ***
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the number for pattern");
        int n=a.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
