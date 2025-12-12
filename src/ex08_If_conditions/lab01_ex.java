package ex08_If_conditions;

public class lab01_ex
{
    public static void main(String[]args)
    {
        String user_input=args[0];
        System.out.println(user_input);
        int age=Integer.parseInt(user_input);
        System.out.println(age);

        if(age>18){
            System.out.println("Yes");
        }
        else{
            System.out.println("You cannot vote");
        }
}}
