package ex19_OOPs_part2.SingleInheritance.realexample;

public class lab1_m {
    public static void main(String[] args){
    lab1_son shra = new lab1_son();
        System.out.println(shra.gold_f);
        shra.bhk2();
        shra.bhk3();

    lab1_father f1  = new lab1_father();
        System.out.println(f1.gold_f);
        f1.bhk2();
}


}