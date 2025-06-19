package core_java_udemy.exceptions;

public class Test {
    static ArrayIndexOOBDemo out;
    public static void main(String[] args) {
        try{
            out.method1();
        }catch(NullPointerException e){
            System.out.println("instantiate out object");
        }

    }
}
