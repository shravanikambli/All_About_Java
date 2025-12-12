package ex16_Arrays;

public class lab08_ex_sum {
    public static void main(String[] args){
        int []numbers={34,76,89};
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }

}
