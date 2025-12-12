package ex23_Super_Abstraction.abstraction;

public class lab02 {
    public static void main(String[] args){
        son s1=new son();
        s1.loan50k();
        s1.loan10k();
    }
}

abstract class AmitFather{
    abstract void loan50k();
    void loan10k(){
        {
            System.out.println("Given");
        }
    }
}

class son extends AmitFather{
    @Override
    void loan50k(){
        System.out.println("Ok, I am Amit, I will give the Father Loan of 50k");
    }
}