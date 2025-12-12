package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab7 {
    public static void main(String[] args){
        List a=new ArrayList<>();
        a.add("bread");
        a.add("Milk");
        a.add("butter");
        a.add("paneer");
        a.add("jam");

        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.contains("1"));

        System.out.println("-----------------");
        for(Object o:a){
            System.out.println(o);
        }
        System.out.println("-----------------");

        Iterator i=a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
