package ex23_Super_Abstraction;

public class lab01ex {
    public static void main(String[] args){
        Child1 a=new Child1();
        a.money();
    }
}
class Child1 implements F1,F2{
    @Override
    public void money(){
        System.out.println("Child money");
    }
}
interface F1{
    final int a=10;
    void money();
}
interface  F2{
    void money();
}