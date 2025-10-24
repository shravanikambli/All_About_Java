package ex10_For_Loop;

public class lab13_ex_continue {
    public static void main(String[]args){
        for(int i=0;i<50;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
