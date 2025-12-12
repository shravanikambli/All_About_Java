package ex20_Polymorphism.MethodOverLoading;

public class lab03_ex {
    public static void main(String[] args){
        home h1=new home();
        h1.task();
        h1.task("kitchen");
    }
}
class home{
    void task(){
        System.out.println("Task cleaning fan");
    }
    void task(String task){
        System.out.println(task);
    }
}