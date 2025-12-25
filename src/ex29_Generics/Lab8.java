package ex29_Generics;

public class Lab8 {
    public static void main(String[] args) {
        Test <Integer> i=new Test<Integer>(5);
        System.out.println(i.getObject());
        Test <Double> b=new Test<Double>(5.5);
        System.out.println(b.getObject());
        Test <String> c=new Test<String>("asas");
        System.out.println(c.getObject());
    }
}
class Test <Test>{
    Test obj;
    Test(Test obj){
        this.obj=obj;
    }
    public Test getObject(){
        return this.obj;
    }

}
