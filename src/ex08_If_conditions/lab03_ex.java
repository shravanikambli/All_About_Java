package ex08_If_conditions;

public class lab03_ex {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>25){
            System.out.println("Yes you can go to goa");
        }
        else{
            System.out.println("You cannot go to goa");
        }
    }
}