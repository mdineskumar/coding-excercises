package core_java_udemy.abstraction.finalconcepts;

public class A {
    final static float pi = 3.14f;

    public final void displayValue(){
        System.out.println(A.pi);
    }

    public static void main(String[] args) {
        final A a1 = new A();
        System.out.println(A.pi);
        //a1.pi = 3.25f;//cannot be changed
        //a1 = new A(); cannot be assigned
    }

}
