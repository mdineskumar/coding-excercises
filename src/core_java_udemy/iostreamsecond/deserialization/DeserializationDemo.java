package core_java_udemy.iostreamsecond.deserialization;

import core_java_udemy.iostreamsecond.serialization.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreamsecond\\serialization\\emp.ser");
            ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            Employee employee = (Employee) obj;
            System.out.println("Employee Object read");
            System.out.println(employee);

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
