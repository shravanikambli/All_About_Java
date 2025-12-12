package ex24_static;

public class Lab02 {
    public static void main(String[] args){
        ATB.markAttendance();
       // ATB.display();
        ATB a=new ATB();
        a.display();
    }
}
class ATB{
    int phone_no=477689;
    String name="gfgj";
    static String course_Name="ATB";
    static void markAttendance(){
        System.out.println("Mark Attendance");
      //System.out.println(this.phone_no);
    }
    void display(){
        System.out.println(this.phone_no + this.name + course_Name);
    }

}