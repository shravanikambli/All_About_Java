package ex30_Collection_Framework.CF4_Map;

import java.util.*;
public class Lab1 {
    public static void main(String[] args) {
Map m1=new HashMap();
        // Map is key - value
m1.put("name","pramod");
    m1.put("phone",2132132311);
    m1.put("roll_no",1);
    System.out.println(m1);

    Map m2=new LinkedHashMap();
    m2.put("name","Shravani");
    m2.put("rollno",1);
    m2.put("phone",23414323);
        System.out.println(m2);

    Map m3=new TreeMap();
    m3.put("name","Shravani");
    m3.put("phone",544345554);
    System.out.println(m3);
    }
}
