package ex27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab16_CustomException {
    public static void main(String[] args)throws Exception {
Bank a=new Bank("INR",87);
        Bank b=new Bank("INR",9);
        Integer total_bal=a.add(b);
        System.out.println(total_bal);

        Bank c=new Bank("USD",897);
Integer total_bal_all_countries=a.add(c);
        System.out.println(total_bal_all_countries);

    }
    }
class Bank {
    private String currancy;
    private Integer amount;

    public Bank(String currancy, Integer amount) {
        this.currancy = currancy;
        this.amount = amount;
    }

    public String getCurrancy() {
        return currancy;
    }

    public void Setcurrency(String currancy) {
        this.currancy = currancy;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception, FileNotFoundException {
        if (bankName.currancy.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CustomException("\"Currency Mismatch, Can't Proceed!\"");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class CustomException extends Exception{
    CustomException (String msg){
        super((msg));
    }
}