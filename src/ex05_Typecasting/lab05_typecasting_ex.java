package ex05_Typecasting;

public class lab05_typecasting_ex {
    public static void main(String[]args){
        int course=100;
        float gst=18.45f;
        //int total1 = course+gst; // Narrowing - Implicit
        //System.out.println(total1);
        int total=course+(int)gst;
        System.out.println(total);
        float total2=course+gst;
        float total3=(float)course+gst;
        System.out.println(total2);
        System.out.println(total3);
    }
}
