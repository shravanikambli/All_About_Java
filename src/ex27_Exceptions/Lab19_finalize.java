package ex27_Exceptions;

public class Lab19_finalize {
    public static void main(String[] args){
        Lab19_finalize a= new Lab19_finalize();
        a=null;
        System.gc();
//Now the object has no reference pointing to it, so it becomes eligible for Garbage Collection (GC).
        System.out.println("main method done");
    }
    @Override
    public void finalize(){
        System.out.println("Finalize method called before GC");
   //Since Java 9, finalize() is deprecated because:
        //
        //It slows down GC
        //
        //It's unpredictable
        }
}
