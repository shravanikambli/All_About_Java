package ex06_Ternary_Operator;

public class lab03_ternary_ex {
    public static void main(String[]args){
        int age=21;
        String result=(age>18)?(age>25? "You can drink":"You can go to goa but cannot drink"):"No";
        System.out.println(result);
    }
}
