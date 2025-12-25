package ex32_Thread_part2;
/*Case 2
Two methods in one class (m1 and m2)
Not Synchronized
Threads: A and B
Thread A calling m1() using same object s1
Thread B calling m2() using same object s1
Inconsistent Results: YES
Thread will run concurrently: YES*/

public class Case2 {
    public static void main(String[] args) {
        Syncc s1=new Syncc();
      //  Sync s2=new Sync();
        AB a=new AB(s1,"A");
        a.start();
        CD b=new CD(s1,"B");
        b.start();
    }
}

class AB extends Thread{
    Syncc s;
    public AB(Syncc s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}

class CD extends Thread{
    Syncc s;
    public  CD(Syncc s,String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m2();
    }
}
class Syncc{
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