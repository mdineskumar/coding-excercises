package core_java_udemy.access_modifiers.p1;

public class B {
    public static void main(String[] args) {
        A aObject = new A();
        //aObject.a cannot be access because it is private only for class
        System.out.println(aObject.b);
        System.out.println(aObject.c);
        System.out.println(aObject.d);
    }
}
