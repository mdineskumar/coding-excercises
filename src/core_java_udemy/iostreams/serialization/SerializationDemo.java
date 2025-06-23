package core_java_udemy.iostreams.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            fos = new FileOutputStream("C:\\Users\\DM2719\\Downloads\\coding\\src\\core_java_udemy\\iostreams\\serialization\\Emp.ser");
            oos = new ObjectOutputStream(fos);

            Employee emp = new Employee(1,"DInes", 4000,12345);

            oos.writeObject(emp);
            System.out.println("Employee object serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
