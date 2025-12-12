package ex19_OOPs_part2.multilevel;

public class ex {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
class A1 {
    void showA() {
        System.out.println("A1 class");
    }
}

class B1 extends A1 {
    void showB() {
        System.out.println("B1 class");
    }
}

class C1 extends B1 {
    void showC() {
        System.out.println("C1 class");
    }
}

