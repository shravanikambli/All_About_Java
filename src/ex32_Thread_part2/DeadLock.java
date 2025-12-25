package ex32_Thread_part2;

public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "ATB";
        final String resource2 = "MTB";

        Thread t1 = new Thread(() ->{
            synchronized (resource1) {
                System.out.println("Thread1:Locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                synchronized (resource2) {
                    System.out.println("Thread1:Locked resource 2");
                }
            }
        });

    Thread t2=new Thread(() ->{
    synchronized (resource2){
        System.out.println("Thread 2:Lockd resource2");
        try{
            Thread.sleep(100);
        }catch (Exception e){

        }
        synchronized (resource1){
            System.out.println("Thread 2:Locked resource  1");
        }
    }
    });
        t1.start();
        t2.start();
    }
    }
