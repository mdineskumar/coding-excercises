package core_java_udemy.iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        int count = 0;
        try(FileReader fr = new FileReader("/Users/dines/Documents/cse_resources/coding/src/core_java_udemy/iostream/myFile.txt");
            BufferedReader br = new BufferedReader(fr);) {
            //decorator pattern
            String line;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()){
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("Number of words in the file are: "+count);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
