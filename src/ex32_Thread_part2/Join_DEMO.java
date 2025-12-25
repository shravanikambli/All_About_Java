package ex32_Thread_part2;

public class Join_DEMO {
    public static void main(String[] args)
    throws Exception{
work h1=new work();
MyThread th1=new MyThread(h1,"A");
th1.start();
th1.join();
Thread th=Thread.currentThread();
for (int i=1;i<=5;i++){
    System.out.println(th.getName()+"--"+i);
}
try{
    Thread.sleep(1000);
}
catch (Exception ex){

}
    }
}
class work{
    void show(){
        Thread th=Thread.currentThread();
        for(int i =1;i<=5;i++){
            System.out.println(th.getName()+"--"+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception ex){

            }
        }
    }
}
class MyThread extends Thread{
    work w;
    public MyThread(work hello,String tname){
        super(tname);
        this.w=hello;
    }
    public void run(){
        w.show();
    }
}