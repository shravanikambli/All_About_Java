package ex30_Collection_Framework.CF1_List;
import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args){
        List fruits=List.of("orange","apple");
        System.out.println(fruits);

        List arrayL=new ArrayList();
        arrayL.add("s");
        arrayL.add("h");
        arrayL.add("r");
        arrayL.add("a");
        arrayL.add(23);
        arrayL.add(23.45);

        System.out.println(arrayL);
        System.out.println(arrayL.size());
    }
}
