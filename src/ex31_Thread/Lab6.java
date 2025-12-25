package ex31_Thread;

public class Lab6 {
    public static void main(String[] args) {
        Runnable a=new Worker6();
        Thread t1=new Thread(a);
        t1.start();

        Runnable b=new Worker6();
        Thread t2=new Thread(b);
        t2.start();
    }
}
class Worker6 implements Runnable{
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
