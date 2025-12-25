package ex29_Generics;

public class Lab9 {
    public static <T1,T2,T3>void temp(T1 a,T2 b,T3 c){
        System.out.println("this is a="+a);
        System.out.println("this is b="+b);

        System.out.println("this is c="+c);

    }
    public static void main(String[] args) {
        temp(1,3,54);
        temp(1,3,54);

        temp('a','b','s');
        temp("ab","cd","ef");


    }
}
