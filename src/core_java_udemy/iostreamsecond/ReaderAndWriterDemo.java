package core_java_udemy.iostreamsecond;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws Exception{
        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\myFile.txt");
        fw = new FileWriter("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\myFile_copy.txt");

        int ch;

        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}
