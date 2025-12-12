package ex23_Super_Abstraction.SuperKeyword;

public class Lab01 {
    public static void main(String[] args){
        TestCase b=new TestCase();

    }
}
class BaseClass {
    BaseClass() {
        System.out.println("Default Constructor");
    }

    BaseClass(String Browser) {
        this.browser = browser;
        System.out.println("Default Constructor Parent");
    }


    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class TestCase extends BaseClass{
    void testC(){}
    TestCase(){
        //super(); // DC
        super("Chrome"); // PC
        super.openBrowser(); // Normal - T1
        super.openBrowser("Chrome"); // Type 3
        super.closeBrowser();//  Normal
        System.out.println(super.getBrowser()); // Get
        super.setBrowser("firefox"); // Set

    }
}