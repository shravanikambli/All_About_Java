package ex29_Generics;

public class Lab2 {
/*Java does NOT allow a + b directly for type <T> because T could be anything.

So to make + work, we must tell Java:

Either T must be a Number

Or we do runtime checks

Or we force String concatenation*/

        static <T extends Number> double add(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }

        public static void main(String[] args) {
            System.out.println(add(10, 20));          // int
            System.out.println(add(12.5, 7.5));       // double
            System.out.println(add(100L, 250L));      // long
        }
    }


