package ex30_Collection_Framework.CF1_List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Lab10 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        String continueInput="Y";
        List <String> names=new ArrayList<>();
        while (continueInput.equalsIgnoreCase("y")){
            System.out.println("Enter the name");
            String name=a.next();
            names.add(name);
            a.nextLine();
            System.out.println("Do you want to enter another name");
            continueInput=a.nextLine();
        }
        for (String name:names){
            System.out.println(name);
        }
        a.close();
    }
}
