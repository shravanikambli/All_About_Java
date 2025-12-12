package ex27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab15_throws {
    public static void main(String[] args){
        try{
            FileInputStream f=new FileInputStream("c://a.txt");
/*FileInputStream → reads binary data (bytes)

Useful for:

Images

PDFs

Videos

Audio files

Any file that is not plain text

Example: reading an image file*/
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("yes");
        }
    }
}
