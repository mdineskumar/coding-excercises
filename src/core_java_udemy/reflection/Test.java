package core_java_udemy.reflection;

import core_java_udemy.BMICalculator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(Class.forName(Calculator.class.getName()));
            Class<?> myClass = Class.forName(Calculator.class.getName());
            System.out.println(myClass.getName());
            Constructor<?>[] constructors = myClass.getConstructors();
            System.out.println(Arrays.toString(constructors));
            System.out.println(Arrays.toString(myClass.getMethods()));

            //create instance of class
            //default constructor
            Constructor<?> constructor = myClass.getConstructor(null);
            Object o = constructor.newInstance(null);
            System.out.println(o);
            //parameterized constructor
            Constructor<?> constructor2 = myClass.getConstructor(double.class,double.class);
            Object o1 = constructor2.newInstance(5,19);
            System.out.println(o1);

            Method getNum1 = myClass.getMethod("getNum1", null);
            System.out.println(getNum1.invoke(o1,null));

            Method getNum2 = myClass.getMethod("getNum2", null);
            System.out.println(getNum2.invoke(o1,null));



            //
            Method setNum1 = myClass.getMethod("setNum1", double.class);
            setNum1.invoke(o1,34);

            //modifyying private fields
            Field num1 = myClass.getDeclaredField("num1");
            num1.setAccessible(true);//private variable to set
            num1.set(o1,12.34);

            System.out.println(getNum1.invoke(o1,null));

            Method setNum2 = myClass.getMethod("setNum2", double.class);
            setNum2.invoke(o1,6);
            System.out.println(getNum2.invoke(o1,null));

            Method sum = myClass.getMethod("sum",double.class,double.class);
            System.out.println(sum.invoke(o1,14,23));

            Annotation[] anotations = myClass.getAnnotations();
            System.out.println(Arrays.toString(anotations));
            MyAnnotation anotation = (MyAnnotation) anotations[0];
            System.out.println(anotation.value1());
            System.out.println(anotation.value2());

//            setNum2.getAnnotations();
//            num1.getAnnotations();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
