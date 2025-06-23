package core_java_udemy.iostreams.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            fis = new FileInputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreams\\serialization\\Emp.ser");
            ois = new ObjectInputStream(fis);
            Employee emp;
            Object obj = ois.readObject();
            if (obj instanceof Employee){
                emp = (Employee) obj;
                System.out.println("Employee ID: "+emp.id);
                System.out.println("Employee salary: "+emp.salary);
                System.out.println("Employee name: "+emp.name);
                System.out.println("Employee ssn: "+emp.ssn);
            }

            System.out.println("Employee object deserialized");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
