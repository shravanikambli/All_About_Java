package ex24_static;

public class Lab04 {
}
class ATB14x{
    {
        System.out.println("IIB-this is called when Object is created ");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
    }
    static {
        System.out.println("Load the class?, I will execute");
    }
    private String name;
    private String phone;
    static String courseName="ATB14x";
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public String getPhone(){
    return phone;
}
public void setPhone(String phone){
    this.phone=phone;
}

void readDocument(){
    System.out.println("Non static Method");
    System.out.println(courseName);
}
static void doAssignment(){
    //System.out.println(phone);
    System.out.println("Do Assignment");
}
}