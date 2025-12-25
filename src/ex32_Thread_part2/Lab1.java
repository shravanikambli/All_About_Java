package ex32_Thread_part2;

public class Lab1 {
    public static void main(String[] args) {
        Bank at=new Bank();
        Runnable r=new AccountThread(at);
        Thread th1=new Thread(r,"shra");
        th1.start();
        Thread th2=new Thread(r,"vani");
        th2.start();
    }
}


class AccountThread implements Runnable{
    Bank b;
    public AccountThread(Bank accService){
        this.b=accService;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            b.withdraw(225);
            if(b.getBalance()<0){
                System.out.println("Amount max out ");
            }
        }
    }
}
class Bank{
    int balance=1000;
    void withdraw(int amoutTo){
      //  synchronized void withdraw(int amounTo){
       Thread th=Thread.currentThread();
        if(balance>=amoutTo){
            System.out.println("withdraw->"+amoutTo+"\t"+th.getName());
try{
    Thread.sleep(1000);
}
catch (Exception e){
    System.out.println(e.getMessage());
}
balance=balance-amoutTo;
System.out.println(balance+"done->\t"+th.getName());

        }
        else{
            System.out.println("Low Balance");
        }
    }
    public int getBalance(){
        return balance;
    }
}
