package core_java_udemy;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        //            Student s2 = Class.forName("Student").newInstance();
        try {
            Student s2 = Student.class.getConstructor(null).newInstance(null);
            Student s3 = (Student)s1.clone();

            DateFormat instance = DateFormat.getInstance();//Factory method
            //instance.format()

        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
