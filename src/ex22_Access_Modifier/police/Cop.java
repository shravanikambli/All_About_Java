package ex22_Access_Modifier.police;

public class Cop {
    private int gun;
    private String icard;

     public Cop(int bullet){
        this.gun=bullet;
    }
    protected void canIshoot(){
        // thief.thisDefaultF1();

    }
    void thisDefaultf1(){
         System.out.println("Hi!cop");
    }
}
