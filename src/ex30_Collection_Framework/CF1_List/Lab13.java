package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab13 {
    public static void main(String[] args) {
        List<String> b=new ArrayList<>();
        b.add("shra");
        b.add("vani");
        b.add("kambli");

        System.out.println("To print arr1");
    for(String a:b){
        System.out.println(a);
    }
        System.out.println("To print arr2");
        Iterator<String>io=b.iterator();
        while (io.hasNext()){
            System.out.println(io.next());
        }
        System.out.println("To print arr3");
for(int i=0;i<b.size();i++){
    System.out.println(b.get(i));
}

    }
}
