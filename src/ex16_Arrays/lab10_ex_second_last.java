package ex16_Arrays;

import java.util.Arrays;

public class lab10_ex_second_last {
    public static void main(String[] args){
        int[]numbers={21,34,56,23,43};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        //printing second last number of array
    }
}
