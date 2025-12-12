package ex30_Collection_Framework.CF1_List;

import java.util.Stack;

public class Lab14 {
    public static void main(String[] args) {
        Stack a=new Stack();
        //LIFO
        Stack s=new Stack();
        s.add("Shra");
        s.add("Vani");
        s.add("Kambli");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());

        System.out.println("----------------");
        System.out.println(s.add("Snehal"));
        System.out.println("----------------");
        System.out.println(s);
        s.add("sa");
        s.add("sa");
        s.add("kjkklj");
        s.push("priya");
        System.out.println(s);
    }
}
