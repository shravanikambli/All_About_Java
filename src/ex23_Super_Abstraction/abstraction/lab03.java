package ex23_Super_Abstraction.abstraction;

public class lab03 {
    public static void main(String[] args){
        alto a=new alto();
        a.drive();
    }
}
class alto extends car1 implements tyre,gear,engine{
 void drive(){
     rubberTyre();
     blackColorDoToTyre();
     startCar();
     startEngine();
     changeGear();
     stopCar();
 }

 @Override
    void startCar(){
     System.out.println("Starting the car");
 }
@Override
    void stopCar(){
     System.out.println("Stop the car");
}
@Override
    public void changeGear(){
    System.out.println("changeGear the car");

}

    @Override
    public void rubberTyre() {
        System.out.println("rubberTyre the car");

    }

    @Override
    public void blackColorDoToTyre() {

     System.out.println("blackColorDoToTyre the car");
    }
@Override
    public void startEngine(){
    System.out.println("Staring engine");
}
}
interface tyre{
    abstract void rubberTyre();
    void blackColorDoToTyre();
}

interface gear{
    void changeGear();
}

interface engine{
    void startEngine();
}
abstract class car1{
    abstract void startCar();
    abstract void stopCar();
}
abstract class A{

}