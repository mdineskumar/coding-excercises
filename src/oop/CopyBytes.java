package oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("src/demo.txt");
            out = new FileOutputStream("src/output.txt");
            int c;

            while( (c = in.read()) != -1){
                out.write(c);
            }
        }finally {
            if(in!=null){
                in.close();
            }

            if(out!= null){
                out.close();
            }
        }



    }
}
