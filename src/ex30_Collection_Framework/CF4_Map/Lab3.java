package ex30_Collection_Framework.CF4_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        Map<String,Object>s1=new HashMap<>();
        s1.put("name","Shravani");
        s1.put("phone","234143223");
        s1.put("address","vengurla");
        System.out.println(s1);
        Map<String,Object>s2=new LinkedHashMap<>();
        s2.put("name","Shravani");
        s2.put("phone","231342342");
        s2.put("address","vengurla");
        System.out.println(s2);
        Set book_read_items=new HashSet();
        book_read_items.add("Rich dad poor dad");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habbit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);
    }
}
