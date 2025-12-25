package ex32_Thread_part2;
/*
Case 4
Two methods in one class (m1 and m2)
Synchronized
m1 → Synchronized
m2 → Not Synchronized
Threads: A, B
Thread A calling m1() using same object s1
Thread B calling m2() using same object s1
Inconsistent Results: Yes → (Lock on one method only)
Thread will run concurrently: Yes → (Concurrent)
*/

public class Case4 {
    public static void main(String[] args) {
        Synccc1 s1=new Synccc1();
        //  Sync s2=new Sync();
        ABAB1 a=new ABAB1(s1,"A");
        a.start();
        CDCD1 b=new CDCD1(s1,"B");
        b.start();
    }
}

class ABAB1 extends Thread{
    Synccc1 s;
    public ABAB1(Synccc1 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class CDCD1 extends Thread{
    Synccc1 s;
    public  CDCD1(Synccc1 s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Synccc1{
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