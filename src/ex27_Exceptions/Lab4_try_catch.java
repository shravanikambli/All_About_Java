package ex27_Exceptions;

public class Lab4_try_catch {
    public static void main(String[] args) {
String s1=null;
try{
    s1.trim();
        }
catch (Exception e){
    System.out.println("Error, Trim not allowed for the null values");
}
    }
}