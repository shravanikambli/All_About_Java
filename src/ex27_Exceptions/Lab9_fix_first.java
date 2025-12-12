package ex27_Exceptions;

public class Lab9_fix_first {
    public static void main(String[] args) {
try{
    String ip=args[0];
    int a=Integer.parseInt(ip);
    int b=100/a;
    System.out.println(b);
}
catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
    System.out.println("problem");
}
finally {
    System.out.println("I will be always called");
}
    }
}