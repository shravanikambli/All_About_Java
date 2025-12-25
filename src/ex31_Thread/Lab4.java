package ex31_Thread;

public class Lab4 {
    public static void main(String[] args) {
        Worker4 w1=new Worker4();
        w1.start();

        Worker4 w2=new Worker4();
        w2.start();

        for(int i=0;i<5;i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }
}}

class Worker4 extends Thread{
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
