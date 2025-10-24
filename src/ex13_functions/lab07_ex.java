package ex13_functions;
import java.util.Scanner;
public class lab07_ex {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=readInt(s,"enter the num1 ");
        int b=readInt(s,"enter the num2 ");

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        int result_mod=mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);

    }
    static int readInt(Scanner sc,String prompt){
        System.out.println(prompt);
        if(sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.out.println("Enter integer only");
            System.exit(0);
            return 0;
        }

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int div(int a,int b)  throws ArithmeticException {
            if(b==0){
                throw new ArithmeticException("division by zero is not allowed");
            }
            return a/b;
        }

    static int mul(int a,int b){
        return a*b;
    }
    static int mod(int a,int b){
        return a%b;
    }
}
