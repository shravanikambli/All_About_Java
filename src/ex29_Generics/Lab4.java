package ex29_Generics;

public class Lab4 {
    //Generic + ALWAYS concatenates as strings
    static <T> void concat(T a, T b){
        System.out.println(a.toString() + b.toString());
    }

    public static void main(String[] args) {
        concat(10, 32);
        concat(12.5, 9.5);
        concat("Hello ", "World");
    }
}
