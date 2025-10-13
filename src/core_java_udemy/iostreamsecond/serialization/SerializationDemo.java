package core_java_udemy.iostreamsecond.serialization;

import core_java_udemy.iostreamsecond.FileOutputStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(100, "John", 1223, 3400.42);

        FileOutputStream fos = null; // write file
        ObjectOutputStream oos = null;//write object to stream

        try {
            fos = new FileOutputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\serialization\\emp.ser");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(employee);
            System.out.println("Employee object serialized");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
