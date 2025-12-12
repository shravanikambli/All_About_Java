package ex19_OOPs_part2.hybrid_Inheritance;

public class ex {
    public static void main(String[] args) {
        D4 obj = new D4();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
interface A4 {
    void showA();
}

interface B4 extends A4 {
    void showB();
}

interface C4 {
    void showC();
}

class D4 implements B4, C4 {
    public void showA() { System.out.println("A4 Interface"); }
    public void showB() { System.out.println("B4 Interface"); }
    public void showC() { System.out.println("C4 Interface"); }
}

