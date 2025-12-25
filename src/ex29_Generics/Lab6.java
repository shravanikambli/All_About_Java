package ex29_Generics;

public class Lab6{
    public static <DT extends Comparable<DT>> DT maximumOf(DT a,DT b,DT c){
        DT max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }

public static void main(String[] args){
        System.out.println(maximumOf(12,43,87));
        System.out.println(maximumOf(1.2,5.8,3.9));
        System.out.println(maximumOf('a','g','j'));
}
    }
