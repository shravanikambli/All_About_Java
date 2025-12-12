package ex21_Encapsulation;

public class lab01_VWOLogin {
    public static void main(String[] args){
    VWOLogin v=new VWOLogin("admin","1234");
    System.out.println(v.password);
    v.password="6789";
    System.out.println(v.password);

    GoodVwoLogin g=new GoodVwoLogin("admin","abcd");
//        System.out.println(vwoLogin1.password);
String pass= g.getpassword();
//        System.out.println(vwoLogin1.password);
g.setpassword("aaaa",false);
}}
class VWOLogin{
    public String username;
    public String password;
    VWOLogin(String username,String password){
        this.password=password;
        this.username=username;
    }
}

class GoodVwoLogin{
    private String username;
    private String password;
    GoodVwoLogin(String username, String password) {
        this.password = password;
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setusername(String username){
        this.username=username;
    }

public String getpassword(){
    return password;
    }

    public void setpassword(String password,boolean IsGoodAdmin){
if(IsGoodAdmin){
    this.password=password;
}
else{
    System.out.println("Not allowed");
}
    }
}