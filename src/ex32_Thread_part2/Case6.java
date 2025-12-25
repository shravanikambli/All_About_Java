package ex32_Thread_part2;
/*
Case 6
Two methods in one class (m1 and m2)
Synchronized
m1 → Static synchronized
m2 → Static synchronized
Threads: A, B
Thread A calling m1() using object s1
Thread B calling m2() using object s1
Inconsistent Results: No
Thread will run concurrently: No → (One by one)
*/

public class Case6 {
    public static void main(String[] args) {
        Synccc3 s1=new Synccc3();
        //  Sync s2=new Sync();
        ABAB3 a=new ABAB3(s1,"A");
        a.start();
        CDCD3 b=new CDCD3(s1,"B");
        b.start();
    }
}

class ABAB3 extends Thread{
    Synccc3 s;
    public ABAB3(Synccc3 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class CDCD3 extends Thread{
    Synccc3 s;
    public  CDCD3(Synccc3 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Synccc3{
   static synchronized  void m1(){
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

    static synchronized void m2(){
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