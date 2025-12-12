package ex16_Arrays;

public class lab01_ex {
    public static void main(String []args){
        int a=10;
        int marks[]={12,4,454,67,98,34};
        boolean[] is_married_people={true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //        System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException

        String name="Shravani";
        String []name_each_element_char=name.split("");
     for(String s:name_each_element_char){
         System.out.println(s);
     }
    }
}
