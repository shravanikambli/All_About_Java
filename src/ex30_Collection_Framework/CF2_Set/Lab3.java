package ex30_Collection_Framework.CF2_Set;

import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        Set <Integer> s=new TreeSet<>();
        s.add(9);
        s.add(3);
        s.add(5);
        System.out.println("Set element:"+s);

        Iterator i=s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
