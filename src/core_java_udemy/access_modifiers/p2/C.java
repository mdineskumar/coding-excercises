package core_java_udemy.access_modifiers.p2;

import core_java_udemy.access_modifiers.p1.A;

public class C extends A {

    public static void main(String[] args) {
        A aObject = new A();
        System.out.println(aObject.d);
        //others are not able to access
        // only inherited not directly aObject.c

        C cObject = new C();
        System.out.println(cObject.c);
        System.out.println(cObject.d);
    }
}
