package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.List;

public class Lab8 {
    public static void main(String[] args){
        List<String> fruit1=new ArrayList();
        fruit1.add("Orange");
        fruit1.add("mango");
        fruit1.add("grapes");

        System.out.println(fruit1);
        System.out.println("-----------------");
        List fruit2=new ArrayList<>();
        fruit2.add("cherry");
        fruit2.add("banana");

        System.out.println(fruit2);
        System.out.println("-----------------");

        List veg=new ArrayList<>();
        veg.add("Tomato");
        veg.add("patato");
        veg.add("onion");
        System.out.println(veg);

        List all=new ArrayList();
        all.add(fruit1);
        all.add(fruit2);
        all.add(veg);

        System.out.println(all);
        System.out.println(all.size());
        System.out.println(all.get(1));
    }
}
