package ex19_OOPs_part2.multilevel;

public class m {
    public static void main(String[] args) {
     son shra=new son();
      shra.home3();
      shra.home2();
      shra.home1();

      father f=new father();
      f.home2();
      f.home1();

      grandfather g=new grandfather();
      g.home1();

        // Dynamic Dispatch
        grandfather g1 = new son();
        father f1  = new son();
    }
    }
