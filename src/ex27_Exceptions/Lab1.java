package ex27_Exceptions;

public class Lab1 {
    public static void main(String[] args){
        System.out.println("Start the program");
        String ip=args[0];
        int a=Integer.parseInt(ip);
        int b=100/a;
        System.out.println(b);
        System.out.println("end the program");

    }
}
