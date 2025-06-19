package core_java_udemy.exceptions.checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    void readFile() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("");
    }
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("FIle could not be found");
        }

        CheckedException ce = new CheckedException();
        try {
            ce.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found");
        }
    }
}
