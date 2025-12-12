package ex15_StringBuffer_StringBuilder_StringFunctions;

public class lab06_ex {
    public static void main(String[]args){
        StringBuffer a=new StringBuffer("Java");
        a.append("Programming");
        System.out.println(a);

        a.replace(0,4 ,"c++");
        System.out.println(a);
    }
}
