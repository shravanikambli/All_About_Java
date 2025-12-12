package ex23_Super_Abstraction.abstraction;

public class Lab04 {
    public static void main(String[] args){
        Car2 a=new Car2();
        a.drive();
    }
}

class Car2 implements Breaks,Engine1{
    void drive(){
        StartEngine();
        applyBreaks();
        StopEngine();
    }
    @Override
    public void testEngine(){
        System.out.println("Override by the Car 1");
    }
    @Override
    public void applyBreaks() {
        System.out.println("Apply Break");
    }
    @Override
    public void StartEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void StopEngine() {
        System.out.println("Stop Engine");
    }
}

interface Engine1{
    void  StartEngine();
    void StopEngine();
    default void testEngine(){
        System.out.println("concrete complete");
    }
    default void testEngine1() {
        System.out.println("concrete complete");
    }

}
interface Breaks{
    void applyBreaks();
}