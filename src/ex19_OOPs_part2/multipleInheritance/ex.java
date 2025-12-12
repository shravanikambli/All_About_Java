package ex19_OOPs_part2.multipleInheritance;

public class ex {
    public static void main(String[] args) {
        C3 obj = new C3();
        obj.showA();
        obj.showB();
    }
}
interface A3 {
    void showA();
}

interface B3 {
    void showB();
}

class C3 implements A3, B3 {
    public void showA() { System.out.println("A3 Interface"); }
    public void showB() { System.out.println("B3 Interface"); }
}

