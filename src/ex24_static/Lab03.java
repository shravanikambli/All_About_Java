package ex24_static;

public class Lab03 {
    public static void main(String[] args) {
        AB a = new AB();
       // AB.m1();
    }

}
class AB{
    static {
        System.out.println("Called only when class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");

    }
    static int a=10;
    static void m1(){
        System.out.println("static function");
    }
}