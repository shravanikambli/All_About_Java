package ex27_Exceptions;

public class Lab2_unchecked_exception {
    public  static void main(String[] args){
        int a=0;
        int b=10;
        int c=b/a;// java.lang.ArithmeticException
        System.out.println(c);
        // UnChecked -> ArithmeticException, NullPointerException
        String name=null;
        name.trim();
        // java.lang.NullPointerException: Cannot invoke "String.trim()"
    }
}
