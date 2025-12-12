package ex29_Generics;
public class Lab1 {

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData(100);        // Integer
        printData(45.6);       // Double
        printData("Shravani"); // String
        printData(true);       // Boolean
    }
}
