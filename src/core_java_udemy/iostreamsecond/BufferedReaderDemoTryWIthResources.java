package core_java_udemy.iostreamsecond;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemoTryWIthResources {
    public static void main(String[] args) {
        //resource block

        try (FileReader fr = new FileReader("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\myFile.txt");
             BufferedReader br = new BufferedReader(fr);) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("Number of tokens in the file: " + count);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
