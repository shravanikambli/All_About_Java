package ex30_Collection_Framework.CF3_Queue;
import java.util.*;
public class Lab1 {
    public static void main(String[] args) {
        PriorityQueue a=new PriorityQueue();
        a.add("Shravani");
        a.add("Kambli");
        System.out.println(a);
        // natural sorting
        System.out.println(a.peek());
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a);
    }
}
