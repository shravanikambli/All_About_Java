package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab3 {
    public static void main(String[] args){
        List l=new ArrayList();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println("-------------");
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("3"));
        System.out.println(l.lastIndexOf("3"));

        System.out.println(l);

        System.out.println("-------------");
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("-------------");
        for(Object a:l){
        System.out.println(a);
        }
        System.out.println("-------------");
        Iterator i=l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

}
