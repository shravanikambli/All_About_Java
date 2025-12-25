package ex31_Thread;


public class Lab5 {
    public static void main(String[] args) {
       ThreadGroup a=new ThreadGroup("Worker");
       //changing the name of thread group
        Worker5 w1=new Worker5(a,"w1");
        w1.start();

        Worker5 w2=new Worker5(a,"w2");
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

class Worker5 extends Thread{
    Worker5(ThreadGroup a,String name){
        super(a,name);
    }
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
