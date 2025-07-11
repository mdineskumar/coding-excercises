package core_java_udemy.java8features.methodref.constructors;

public class Test {

    public static void main(String[] args) {
        MyInterface f1 = s -> new MyClass(s);
        MyClass m = f1.get("Dines");

        MyInterface f2 = MyClass::new;
        f2.get("using constructor mapping");
    }
}
