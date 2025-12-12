package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab17 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        for(Integer as:a){
            System.out.println(5*as);
        }
    }
}
