package ex23_Super_Abstraction.abstraction;

public class Lab01 {
    public static void main(String[] args) {
   Car t=new Car(300);
   t.drive();

    }
}
class Vehicle{
    public int maxspeed=10;
    void noTest(){
        System.out.println("Empty");
    }
    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Parameterised Constructor");
    }
    Vehicle(int a, int b ){
        System.out.println("Param Con");
    }
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("Parameterised Constructor");
    }

    void drive(){
        System.out.println("Parameterised Constructor");

    }
}

class Car extends Vehicle{
    private int maxspeed=52;
    Car(){
        super(100);
    }
    Car(int a){
        System.out.println("Parameterised Constructor");

    }
    void test(){

    }
    @Override
    void drive(){
        System.out.println("Over ridden the vehicle");
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.noTest();
        this.test();
    }
}