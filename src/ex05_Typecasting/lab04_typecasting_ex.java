package ex05_Typecasting;

public class lab04_typecasting_ex {
    public static void main(String[]args){
    long phone_no=213346578l;
   // short s=phone_no; // Narrowing - implicit
    short sh=(short)phone_no;
    System.out.println(sh);
}
}