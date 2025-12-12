package ex15_StringBuffer_StringBuilder_StringFunctions;

public class lab03_ex {
    public static void main(String[]args){
        StringBuffer s=new StringBuffer("Mydreams");

        s.append(("Coompleting"));
        System.out.println(s);

        String s1="On the way to complete";
        s1=s1+"happy now";
        System.out.println(s1);
    }
}
