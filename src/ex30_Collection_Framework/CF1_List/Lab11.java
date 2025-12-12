package ex30_Collection_Framework.CF1_List;
import java.util.*;
public class Lab11 {
    public static void main(String[] args){
        List a=new ArrayList();
        List b=new ArrayList(10);
        List c=List.of("23","34");

        List mylist=new LinkedList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        System.out.println(mylist);

    }
}
