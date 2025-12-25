package ex31_Thread;

public class Lab2 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(t.getName()+i+"-"+t.getThreadGroup()+"-"+t.getPriority());
        }
    }
}
