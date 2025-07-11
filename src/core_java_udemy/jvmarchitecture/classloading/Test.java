package core_java_udemy.jvmarchitecture.classloading;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        //dynamically load class into memory

        try {

            Class c = Class.forName("core_java_udemy.jvmarchitecture.classloading.User");
            Method[] declaredMethods = c.getDeclaredMethods();

            for (Method method :
                    declaredMethods) {
                System.out.println(method.getName());
            }

            System.out.println(declaredMethods.length);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
