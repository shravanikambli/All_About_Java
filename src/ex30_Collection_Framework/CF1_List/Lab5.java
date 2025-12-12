package ex30_Collection_Framework.CF1_List;

import java.util.Vector;

public class Lab5 {
    public static void main(String[] args){
        Vector v=new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        System.out.println(v);
        v.remove("a");
        System.out.println(v.contains("b"));
        System.out.println(v);
    }
}
