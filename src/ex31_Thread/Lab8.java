package ex31_Thread;



public class Lab8 {
    public static void main(String[] args) {
        Runnable a=new Worker8();
        Thread t1=new Thread(a);
        t1.start();

        Runnable b=new Worker8();
        Thread t2=new Thread(b);
        t2.start();
        t2.setPriority(7);
       System.out.println("priority is "+Thread.currentThread().getPriority());

        for(int i=0;i<5;i++){
            System.out.println(i+"--"+Thread.currentThread().getName());
        }
    }
}
class Worker8 implements Runnable{
//Thread using runnble interface

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
