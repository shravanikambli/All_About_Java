package ex22_Access_Modifier.criminal;
import ex22_Access_Modifier.police.Cop;
//here we import the cop class from different package
public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
//        thief.canIshoot();
        // thief.thisDefaultf1();

    }
}