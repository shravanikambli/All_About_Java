package ex23_Super_Abstraction;

public class labex {
    public static void main(String[] args){
        CAB a=new CAB();
        a.display();
    }
}
class XYZ{
    XYZ(){

    }
    protected int my_gold=10;
}
class CAB extends XYZ{
    void display(){System.out.println(super.my_gold);}
}

