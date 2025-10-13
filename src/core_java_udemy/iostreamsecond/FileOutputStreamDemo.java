package core_java_udemy.iostreamsecond;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\profile.png");
            fos = new FileOutputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\profile_copy.png");

            int i;

            while((i = fis.read()) != -1) {
                fos.write(i);
            }
            System.out.println("File Copied!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }  finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
