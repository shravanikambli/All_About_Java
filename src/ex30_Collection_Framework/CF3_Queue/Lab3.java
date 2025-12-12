package ex30_Collection_Framework.CF3_Queue;
import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        Queue<Integer> a=new LinkedList<>();
         a.add(12);
        a.add(45);
        a.add(5);
        Iterator<Integer>abcd=a.iterator();
        while (abcd.hasNext()){
            Integer v=abcd.next();
            System.out.println(v);
        }
    }
}
