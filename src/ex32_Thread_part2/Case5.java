package ex32_Thread_part2;
/*
Case 5
Two methods in one class (m1 and m2)
Synchronized
m1 → Instance synchronized
m2 → Static synchronized
Threads: A, B
Thread A calling m1() using object s1
Thread B calling m2() using object s1
Inconsistent Results: Yes
Thread will run concurrently: Yes (Concurrent)
*/


public class Case5 {
    public static void main(String[] args) {
        Synccc2 s1=new Synccc2();
        //  Sync s2=new Sync();
        ABAB2 a=new ABAB2(s1,"A");
        a.start();
        CDCD2 b=new CDCD2(s1,"B");
        b.start();
    }
}

class ABAB2 extends Thread{
    Synccc2 s;
    public ABAB2(Synccc2 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class CDCD2 extends Thread{
    Synccc2 s;
    public  CDCD2(Synccc2 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Synccc2{
    synchronized  void m1(){
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