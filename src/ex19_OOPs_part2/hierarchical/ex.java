package ex19_OOPs_part2.hierarchical;

public class ex {
    public static void main(String[] args) {
        B2 obj1 = new B2();
        obj1.showA();
        obj1.showB();

        C2 obj2 = new C2();
        obj2.showA();
        obj2.showC();
    }
}
class A2 {
    void showA() {
        System.out.println("A2 class");
    }
}

class B2 extends A2 {
    void showB() {
        System.out.println("B2 class");
    }
}

class C2 extends A2 {
    void showC() {
        System.out.println("C2 class");
    }
}

