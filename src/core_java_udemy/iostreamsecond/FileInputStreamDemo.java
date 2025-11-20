package core_java_udemy.iostreamsecond;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\myFile.txt");
            System.out.println("File Opened");
            int i;

            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                System.out.println("\nFile cloased!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
