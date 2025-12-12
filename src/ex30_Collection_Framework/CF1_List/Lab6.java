package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args){
        List l=new ArrayList<>();
        l.add("1");// 0
        l.add("2");// 1
        l.add("3");// 2
        l.add("4");//3
        l.add("5");//4
        l.add("6");//5

        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("3"));
        System.out.println(l.indexOf("1"));
    }
}
