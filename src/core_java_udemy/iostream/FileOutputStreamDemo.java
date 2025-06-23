package core_java_udemy.iostream;

import java.io.*;

public class FileOutputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(new File("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/iostream/profile.png"));
            fos = new FileOutputStream(new File("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/iostream/profile_copy.png"));

            int data;

            while((data = fis.read()) != -1){
                fos.write(data);
            }
            System.out.println("File copied.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
