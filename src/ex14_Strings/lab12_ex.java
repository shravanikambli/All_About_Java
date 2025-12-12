package ex14_Strings;

public class lab12_ex {
    public static void main(String []args){
        String s="Java";
        char c=s.charAt(2);
        System.out.println(c);

        int result="abc".compareTo("ABC");//diff bet ascii code of small alphabet and big alphabet
        System.out.println(result);//It compares the first characters:
                                    // 'a' (97) − 'A' (65) = 32

        //Since the first character is already different, Java stops and returns 32.

        int idx="Java".indexOf("a");
        System.out.println(idx);

        int idx2="java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b =" ".isEmpty();
        System.out.println(b);

        String s11=String.join("*","java","python");
        System.out.println(s11);

        String s12="java".replace('a','o');
        System.out.println(s12);

        boolean b1="Java".startsWith("Ja");
        System.out.println(b1);

        String b2="Java".concat("Mava");
        System.out.println(b2);

        /*String s5="abcd";
        s5.reverse();Because String is immutable in Java — it has no method called reverse()*/
    }
}
