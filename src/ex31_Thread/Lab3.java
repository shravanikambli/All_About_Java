package ex31_Thread;

public class Lab3 {
    public static void main(String[] args) {
    Worker3 w1=new Worker3();
    w1.start();

    Worker3 w2=new Worker3();
    w2.start();
    }
}

class Worker3 extends Thread{
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
