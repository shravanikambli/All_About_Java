package ex27_Exceptions;

public class Lab18_finally_not_executed {
    public static void main(String[] args) {
    try{
        int a=10/10;
        System.out.println("Try Executed");
        System.exit(0);
    }
    catch (Exception e){
        System.out.println("Catching the exception");
    }
    finally {
        System.out.println("I will be always executed!");
    }
    }
    }
