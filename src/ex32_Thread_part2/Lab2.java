package ex32_Thread_part2;

import java.util.Stack;

public class Lab2 {
    public static void main(String[] args) {
        Stack st=new Stack();
        B1 obj2=new B1(st,"B");
        A1 obj1=new A1(st,"A");
    }
}
class stack{
    int x;
    boolean flag=false;
    synchronized void push(int x){
        if(flag){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        this.x=x;
        System.out.println(x+"is pushed..");
        flag=true;
        notify();
    }
    synchronized public int pop(){
        if(!flag){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println(x+"is poped");
        try{
            Thread.sleep(10000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        flag=false;
        notify();
        return x;
    }
}
class B1 implements Runnable{
    Stack st=null;
    B1(Stack st,String name) {
        this.st = st;
        Thread t2 = new Thread(this, name);
        t2.start();
    }
        public void run(){
            for(int i=0;i<10;i++){
                st.pop();
            }
        }
    }
    class A1 implements Runnable{
        Stack st=null;
        A1(Stack st,String name){
            this.st=st;
            Thread t1=new Thread(this,name);
            t1.start();
        }
        public void run(){
            int a=1;
            for(int i=0;i<10;i++){
                st.push(a++);
            }
        }
    }
