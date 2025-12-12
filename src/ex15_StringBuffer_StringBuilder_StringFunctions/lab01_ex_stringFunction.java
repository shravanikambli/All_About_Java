package ex15_StringBuffer_StringBuilder_StringFunctions;

public class lab01_ex_stringFunction {
    public static void main(String[]args){
        String name="Shravani";
        System.out.println(name.length());
        System.out.println(name.charAt(3));

        //System.out.println(name.charAt(10));Index 10 out of bounds for length 8
        System.out.println(name.concat("Kambli"));

        System.out.println("-------------------------------");

        System.out.println(name.contains("sh"));
        System.out.println(name);
        System.out.println(name.contains("priya"));
        System.out.println(name.contains("ka"));
        System.out.println("-------------------------------");

        System.out.println(name.equals("sh"));

        System.out.println(name.equalsIgnoreCase("shravani"));
        System.out.println(name.indexOf('i'));
        System.out.println("-------------------------------");

        String s1="madam";
        System.out.println(s1.indexOf("m"));

        System.out.println(name.length());

        System.out.println(name.replace('n','N'));
        System.out.println(name.substring(1,3) );
        System.out.println("-------------------------------");

        System.out.println("SHRAVANI".toLowerCase());
        System.out.println("Kambli".toUpperCase());

        System.out.println(name.startsWith("S"));

        System.out.println(name.startsWith("s"));
        System.out.println(name.endsWith("i"));
        System.out.println("-------------------------------");

        System.out.println(name.endsWith("I"));

        String name3="    Priya           Tandel";//It trim starting space
        System.out.println(name3.trim());

        System.out.println(name.compareTo("Sonal"));
        /*It will compare the first different character.

        Let's compare:

        Character	ASCII/Unicode Value
        'S'	83
        'S'	83
        (first characters are same)

        Next letter:

        Character	ASCII Value
        'h'	104
        'o'	111

        Now it finds a difference:

        ➡️ 104 - 111 = -7*/

        System.out.println("-------------------------------");

        StringBuilder s=new StringBuilder("sh");
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        StringBuilder sb=new StringBuilder("mydream");
        System.out.println(sb.toString());//Because StringBuilder is not a string, it is an object that stores characters.
        //toString() converts the StringBuilder content into a String.

    }
}
