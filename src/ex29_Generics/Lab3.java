package ex29_Generics;

public class Lab3 {


    //Generic with + supporting BOTH numbers and strings

        static <T> void addOrConcat(T a, T b) {

            if (a instanceof Number && b instanceof Number) {
                double sum = ((Number) a).doubleValue() + ((Number) b).doubleValue();
                System.out.println("Number sum = " + sum);

            } else {
                System.out.println("String concat = " + a.toString() + b.toString());
            }
        }

        public static void main(String[] args) {
            addOrConcat(10, 20);                 // sum
            addOrConcat(12.5, 3.5);             // sum
            addOrConcat("Shravani ", "Kambli"); // concat
        }


}
