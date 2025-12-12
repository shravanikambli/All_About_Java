package ex24_static;

public class Lab01 {
    public static void main(String[] args) {

Student s1=new Student(21);
Student s2=new Student(76);
System.out.println(s1.age);
System.out.println(s2.age);
System.out.println(s1.course_Name);
System.out.println(s2.course_Name);

System.out.println(Student.course_Name);
Student.m1();


        }
    }
    class Student{
    int age;
    static String course_Name="ATB";
    public Student(int age_c){
        this.age=age_c;
    }
    static void m1(){
    System.out.println("I am static method");
    }

}
