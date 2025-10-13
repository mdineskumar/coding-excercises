package core_java_udemy.iostreamsecond;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\myFile.txt");
            br = new BufferedReader(fr);

            String line;
            int count = 0;
            while((line=br.readLine())!= null) {
                System.out.println(line);
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("Number of tokens in the file: "+count);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
