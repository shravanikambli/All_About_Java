package ex20_Polymorphism.MethodOverLoading;

public class lab02_ex {
MathOperations a=new MathOperations();
    int r1  = a.add(3,4);
    int r2  = a.add(3,4,6);
    double r3  = a.add(3.14,4.56);
    String r4  = a.add("Shra","vani");}
class MathOperations{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return  a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}