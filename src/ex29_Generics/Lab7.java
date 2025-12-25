package ex29_Generics;

public class Lab7 {
    public static <T> void temp(T a) {
        System.out.println(a);
    }
        public static void main(String []args){
            temp(2);
            temp(21451345);

            temp(2.5);

            temp('a');

        }

}
