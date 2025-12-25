package ex32_Thread_part2;

public class DeadLockSolved {

    public static void main(String[] args) {

        final Resource1 r1 = new Resource1();
        final Resource2 r2 = new Resource2();

        // Thread 1
        Runnable t1 = () -> {
            synchronized (r1) {
                System.out.println("Thread 1 locked Resource1");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (r2) {
                    System.out.println("Thread 1 locked Resource2");
                }
            }
        };

        // Thread 2
        Runnable t2 = () -> {
            synchronized (r1) {   // SAME ORDER → NO DEADLOCK
                System.out.println("Thread 2 locked Resource1");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (r2) {
                    System.out.println("Thread 2 locked Resource2");
                }
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();
    }
}

// Shared Resource 1
class Resource1 {
    private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

// Shared Resource 2
class Resource2 {
    private int i = 20;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
