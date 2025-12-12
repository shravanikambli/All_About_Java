package ex27_Exceptions;

public class Lab11_EC {
    public static void main(String[] args) {
        try {

            String ip=args[0];
            int a=Integer.parseInt(ip);
            int b=100/a;
            System.out.println(b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}