package core_java_udemy.polymorphism.compiletimebinding;

public class CompileTimeBinding {

    void add(int a, int b){
        int result = a + b;
        System.out.println("Result is: "+result);
    }

    void add(float a, float b){
        float result = a + b;
        System.out.println("Result is: "+result);
    }

    void add(int a, int b, int c){
        int result = a+b+c;
        System.out.println("Result is: "+result);
    }



    public static void main(String[] args) {
        CompileTimeBinding c = new CompileTimeBinding();
        c.add(10,40);
        c.add(10f,50f);
        c.add(20,30,40);
    }
}
