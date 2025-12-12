package ex22_Access_Modifier.police;

public class Rahul extends Cop{
    public Rahul(int bullet){
     super(bullet);
    }
    public static void main(String[] args){
        Cop p=new Cop(100);
        p.thisDefaultf1();
    }
}
