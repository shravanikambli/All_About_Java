package ex32_Thread_part2;


/*
Case 3
Two methods in one class (m1 and m2)
They are now Synchronized
Threads: A, B
Thread A calling m1() using same object s1
Thread B calling m2() using same object s1
Inconsistent Results: No → (Lock on Object)
Thread will run concurrently: No → (Synchronized one by one)
*/


public class Case3 {
    public static void main(String[] args) {
        Synccc s1=new Synccc();
        //  Sync s2=new Sync();
        ABAB a=new ABAB(s1,"A");
        a.start();
        CDCD b=new CDCD(s1,"B");
        b.start();
    }
}

class ABAB extends Thread{
    Synccc s;
    public ABAB(Synccc s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class CDCD extends Thread{
    Synccc s;
    public  CDCD(Synccc s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Synccc{
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

    synchronized void m2(){
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