package ex18_OOPs_Constructor;

public class lab02_ex {
    String model;
    int year;
    lab02_ex(){
        model="xxx";
        year=1900;
        System.out.println("Default Constructor");
    }
    lab02_ex(String model_name){
        this();
        this.model=model_name;
    }
    lab02_ex(String model_name,int year_created){
        this("i10");
        this.model=model_name;
        this.year=year_created;
    }

}
