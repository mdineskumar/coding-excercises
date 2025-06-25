package core_java_udemy.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/iostream/myFile.txt");
        fw = new FileWriter("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/iostream/myFileCopy.txt");

        int data;

        while((data = fr.read()) != -1){
            fw.write(data);
        }

        System.out.println("Text copied");

        fr.close();
        fw.close();


    }
}
