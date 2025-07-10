package core_java_udemy.generics;

public class MyGenericClassTest {
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("Bharath");
        s.displayObjectDetails();
        System.out.println(s.getObj());

        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjectDetails();
        System.out.println(i.getObj());
        MyGenericClass<Double> d = new MyGenericClass<>(123.23);
        d.displayObjectDetails();
        System.out.println(d.getObj());
    }
}
