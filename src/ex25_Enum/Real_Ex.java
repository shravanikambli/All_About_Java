package ex25_Enum;

public class Real_Ex {
    public static void main(String[] args){
        System.out.println(Locators.page_input_email.getLocator());
    }
}

enum Locators{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private String Locator;
    Locators(String Locator){
        this.Locator=Locator;
    }
    String getLocator(){
        return this.Locator;
    }
}