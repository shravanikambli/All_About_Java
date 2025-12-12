package ex20_Polymorphism.MethodOverLoading;

public class lab04_Web_Automation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
//        b1.startBrowser();
//        b1.startBrowser("Chrome");
//        b1.startBrowser("Firefox");
    }
}
class Browser{
    void startBrowser(){
        System.out.println("Default browser is started!");
    }

    void startBrowser(String browser){
        // Code to start the chrome browser...
        System.out.println("Starting browser "+ browser);
    }
}