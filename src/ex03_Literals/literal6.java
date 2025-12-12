package ex03_Literals;

public class literal6 {
    public static void main(String[]args){
        char c1='A';
        char c2='b';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='1';
        char c7='(';
        char c8= ' ';

        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("Shravani Kambli");
        System.out.println("Shravani"+new_line+"Kambli");
        System.out.println("Shravani\nKambli");
        System.out.println("Shravani"+tab_line+"Kambli");
        System.out.println("Shravani"+back_space+"Kambli");
        System.out.println("----------------------");

        System.out.println("hi,this is the first line"+new_line+"this is the second line\n this is the third line");

                char c='A';
        // ASCII, (limited numbers) - A -> 65
        char rupees='₹';
        System.out.println(rupees);

        char my_laugh_smily='\u1f60';
        System.out.println(my_laugh_smily);


    }
}
