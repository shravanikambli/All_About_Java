package ex16_Arrays;

import java.util.Arrays;

public class lab05_ex_max_min {
    public static void main(String[] args){
        int []array={12,34,56,54,78};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));  // print sorted array
//Arrays.toString() is used because:
        // It converts array → readable string
        //t it, Java prints memory address

        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("max is"+max);

        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("min is"+min);
    }
}
