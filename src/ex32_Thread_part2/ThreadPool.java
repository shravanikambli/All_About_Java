package ex32_Thread_part2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        HelloThread helloTh=new HelloThread();
        ExecutorService ex= Executors.newFixedThreadPool(5);
        for(int i=1;i<=7;i++){
            ex.execute(helloTh);
        }
        ExecutorService e=Executors.newFixedThreadPool(2);
        for (int i=1;i<=2;i++){
            e.execute(helloTh);
        }
    }
}
 class HelloThread extends Thread{
public void run(){
    Thread t=Thread.currentThread();
    for (int i=1;i<=5;i++){
        System.out.println(i+"Worked and display by"+t.getName());
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }
}
}