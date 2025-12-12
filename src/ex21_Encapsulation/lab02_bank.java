package ex21_Encapsulation;

import java.awt.color.ICC_ColorSpace;

public class lab02_bank {
    public static void main(String[] args){
ICICIBank a=new ICICIBank("Shra",1000);
    long bal=a.getBal();
    System.out.println(bal);

    ICICIBank b=new ICICIBank("cash",100);
    b.setBal(200,true);
    System.out.println(b.getBal());
    }
}

class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal(){
        return bal;
    }
    public void setBal(long bal,boolean iscashier){
        if(iscashier){
            this.bal=bal;
        }
        else{
            System.out.println("Not allowed");
        }
    }
}