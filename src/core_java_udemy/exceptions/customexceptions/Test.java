package core_java_udemy.exceptions.customexceptions;

public class Test {
    public static void main(String[] args) throws CheckedCustomException {
       // throw new UncheckedCustomException("Custom exceptions");
        throw new CheckedCustomException("Business exceptions that needs to be handled");
    }
}
