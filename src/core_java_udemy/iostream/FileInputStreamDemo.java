package core_java_udemy.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/iostream/myFile.txt"));
            System.out.println("File Opened");
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\nFile Closed");
        }

    }
}
