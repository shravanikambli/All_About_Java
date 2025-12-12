package ex16_Arrays;

public class lab04_ex_array_print {
    public static void main(String []args){
        int[]marks={3,34,56,67,78,98};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println("---------");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("-----Enhanced for loop------");
          for(int mark:marks){
              System.out.println(mark);
          }
    }

}
