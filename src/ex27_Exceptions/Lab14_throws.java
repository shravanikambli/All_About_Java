package ex27_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab14_throws {
    public static void main(String[] args)throws FileNotFoundException {
        FileReader f = new FileReader("C://abc.txt");

    }
}
