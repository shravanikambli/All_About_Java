package ex19_OOPs_part2.SingleInheritance.realexample;

public class ex {
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}
class A {
    void showA() {
        System.out.println("A class");
    }
}

class B extends A {
    void showB() {
        System.out.println("B class");
    }
}

