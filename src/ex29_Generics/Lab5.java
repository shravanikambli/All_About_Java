package ex29_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab5 {
    public static void main(String[] args){
        List list_web_element=new ArrayList<>();
        list_web_element.add("shra");
        list_web_element.add(3241);
        list_web_element.add(true);
        list_web_element.add(3.95);

        for(Object a:list_web_element){
            System.out.println(a);
        }
    }
}
