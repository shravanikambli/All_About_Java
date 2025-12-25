package ex32_Thread_part2;

/*Scenario -
One class
Two methods: m1() and m2()
Both methods are NOT synchronized
Two threads:
Thread A calls m1() using object s1
Thread B calls m2() using object s2
Inconsistent Results → No
Thread will run concurrently → Yes
*/
public class Case1 {
    public static void main(String[] args) {
Sync s1=new Sync();
Sync s2=new Sync();
A a=new A(s1,"A");
a.start();
B b=new B(s2,"B");
b.start();
    }
}

class A extends Thread{
    Sync s;
    public A(Sync s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class B extends Thread{
    Sync s;
    public  B(Sync s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Sync{
    void m1(){
        Thread t=Thread.currentThread();
        for(int i =1;i<=5;i++){
            System.out.println(t.getName()+"-m1-"+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }

    void m2(){
        Thread t=Thread.currentThread();
        for(int i=101;i<=105;i++){
            System.out.println(t.getName()+"-m2-"+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }

}