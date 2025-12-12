package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab9 {
    public static void main(String[] args){
        List marks=new ArrayList();
        marks.add(90);
        marks.add(67);
        marks.add(54);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
