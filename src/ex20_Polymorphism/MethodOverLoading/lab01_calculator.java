package ex20_Polymorphism.MethodOverLoading;

public class lab01_calculator {
    public static void main(String[] args){
        calc c1=new calc();
        float res=c1.add(3,8);
        System.out.println(res);
    }
}


class calc{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    float add(float a ,float b){
        return a+b;
    }
    long add(long a,long b ){
        return a+b;
    }
}