package ex27_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab13 {
    public static void main(String[] args) {
    try{
        FileReader r=new FileReader("C://abc.txt");
    }
    catch (FileNotFoundException e){
        System.out.println(e.getMessage());
    }
    }
    }
