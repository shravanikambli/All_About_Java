package ex16_Arrays;

public class lab03_ex {
    public static void main(String[]args){
        String [] names={"sd","gf","fd","df"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String n2[]=new String[3];
        n2[0]="as";
        n2[1]="gf";
        n2[2]="bn";

        System.out.println(n2.length);
        System.out.println(n2[0]);
        System.out.println(n2[1]);
        System.out.println(n2[2]);

        boolean[] is_male_data=new boolean[2];
        is_male_data[0]=true;
        is_male_data[1]=false;
    }
}
