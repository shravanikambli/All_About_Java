package ex27_Exceptions;

public class Lab6_multiple_program {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try{
            c=10/0;
            String s1=null;
            s1.trim();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());

        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
    }
