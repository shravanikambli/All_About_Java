package ex15_StringBuffer_StringBuilder_StringFunctions;

public class lab09_ex {
    public static void main(String[]args){
        String input="Pramod";
        String reversed="";

        for(int i=input.length()-1;i>=0;i--){
            reversed=reversed+input.charAt(i);
        }
        if(reversed.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
