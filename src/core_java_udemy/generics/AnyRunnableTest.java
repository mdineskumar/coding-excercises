package core_java_udemy.generics;

public class AnyRunnableTest {
    public static void main(String[] args) {
        AnyRunnable<MyClass> t = new AnyRunnable<MyClass>();
        //AnyRunnable<String> s = new AnyRunnable<String>(); not accept
    }
}
