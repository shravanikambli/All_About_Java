package ex27_Exceptions;

public class Lab12 {
    public static void main(String[] args) {
    final double pi=3.14;
    int a=0;
    try{
        int x=10/a;
    }
    catch (Exception e){
        System.out.println("div bt zero");
    }
    finally {
        System.out.println("I will be executed anyHow!!");
    }

    }
    }
