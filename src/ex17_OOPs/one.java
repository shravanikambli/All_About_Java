package ex17_OOPs;

public class one {
    public static void main(String[] args){
        stud a=new stud();
        stud b=new stud("Shravani");
    }
}
class stud{
    String name;
    stud() {
        System.out.println("Default Constructor->Hi,I am called");
    }
    stud(String name){
        System.out.println("HI"+name);
    }
    void sleep(){
    }
    void study(){}
    void eat(){}
}