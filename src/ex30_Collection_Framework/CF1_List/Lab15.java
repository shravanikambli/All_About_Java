package ex30_Collection_Framework.CF1_List;

import java.util.ArrayList;
import java.util.List;

public class Lab15 {
    public static void main(String[] args) {
        Student a=new Student("priya","1");
        Student b=new Student("tushar","2");
        Student c=new Student("gayatri","4");

        List<Student>ab=new ArrayList<>();
        ab.add(a);
        ab.add(b);
        ab.add(c);
        a.printdetails();
        b.printdetails();
        c.printdetails();

    }
}
class Student{
    private String name;
    private String rollno;
    public Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getRollno(){
        return rollno;
    }
    public void setRollno(String rollno){
        this.rollno=rollno;
    }


    public void printdetails(){
        System.out.println("student name:"+this.name);
        System.out.println("student rollno:"+this.rollno); }
}