package ex20_Polymorphism.MethodOverRidding;

public class lab02 {
    public static void main(String[] args){
        ChromeTc c1=new ChromeTc();


        Firefox f1=new Firefox();
        f1.OpenBrowser();

        CommonToAll c2=new CommonToAll();
        c2.OpenBrowser();
    }
}
class CommonToAll{
    void OpenBrowser(){
        System.out.println("Starting the IE browser.");
    }
}
class ChromeTc extends CommonToAll{
@Override
void OpenBrowser(){
    System.out.println("Starrting Chrome, Better Browser!!");
}
}
 class Firefox extends CommonToAll{
    @Override
     void OpenBrowser(){
        System.out.println("starrting FirefoxTc, Better Browser!!");
    }
 }
