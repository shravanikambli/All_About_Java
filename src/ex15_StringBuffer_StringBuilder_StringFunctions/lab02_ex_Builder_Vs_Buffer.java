package ex15_StringBuffer_StringBuilder_StringFunctions;

public class lab02_ex_Builder_Vs_Buffer {
    public static void main(String[]args){
        // String - 90% is  used
        String s0="Shravani";
        String s1=new String("Kambli");


        // String - less than 10% is  used
        StringBuffer s2=new StringBuffer("Kambli");
        StringBuilder s3=new StringBuilder("Kambli");

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2.reverse());
        System.out.println(s3.reverse());
    }
}
