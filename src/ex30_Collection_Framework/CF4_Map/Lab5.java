package ex30_Collection_Framework.CF4_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab5 {
    public static void main(String[] args) {
        HashMap<String,String>s1=new HashMap<>();
        s1.put("name","Shravani");
        s1.put("roll","1");
        System.out.println(s1);

        HashMap<String,String>s2=new HashMap<>();
        s2.put("name","suraj");
        s2.put("roll","2");
        s2.put("phone","54665668756");
        System.out.println(s2);

        List s3=new ArrayList();
        s3.add(s1);
        s3.add(s2);
        System.out.println(s3);
    }
}
