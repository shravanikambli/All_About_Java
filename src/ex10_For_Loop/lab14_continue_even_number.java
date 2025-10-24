package ex10_For_Loop;

public class lab14_continue_even_number {
    public static void main(String[]args){
        for(int i =1;i<=50;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
