package ex23_Super_Abstraction.SuperKeyword;

public class Lab02 {
    public static void main(String[] args){
    Son s=new Son();
    s.newHome();
}}
class Father{
    Father() {
        System.out.println("Default Constructor Father");
    }
    int gold=10;
    void home(){
        System.out.println("Home Father");
        }

}

class Son extends Father{
    Son(){
        super();
    }
        int gold_c=100;
        void bike(){}
    void newHome(){
            System.out.println(super.gold);
            super.home();
            this.bike();
            System.out.println(this.gold_c);
        }
}