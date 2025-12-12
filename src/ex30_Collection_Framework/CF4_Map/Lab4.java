package ex30_Collection_Framework.CF4_Map;
import java.util.*;
public class Lab4 {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("id",1);
        map.put("id",2);
        map.put("id",34);
        //map.put(null,"12");
        map.put("id",null);

        System.out.println(map);
        System.out.println(map.size());
        for(Map.Entry<String,Integer>item:map.entrySet()){
            System.out.println(item.getKey()+"->"+item.getValue());
        }
    }
}
