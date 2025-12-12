package ex30_Collection_Framework.CF2_Set;
import java.util.HashSet;
import java.util.*;
public class Lab2 {
    public static void main(String[] args) {
        Set <String> hs=new HashSet<>();
// Hashing mechanism to store the element,no order.
// no duplicates

        hs.add("apple");
        hs.add("orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
    //hs.add(324);
        hs.add(null);
        System.out.println(hs);

        System.out.println("---------------------------");
        Set lhs=new LinkedHashSet();
// LinkedList mechanism to store the element,
// order will maintain, no duplicates

        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());
        System.out.println("---------------------------");

        Set ts=new TreeSet();
        ts.add("apple");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Watermelon");
// ts.add(123); // java.lang.ClassCastException
// ts.add(null); // java.lang.NullPointerException
   System.out.println(ts);
    }
}
