package algomaster_lld.polymorphism.method_overloading;

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("sum(2 numbers): "+math.add(5,10));
        System.out.println("sum(3 numbers): "+math.add(5,10,15));
    }
}
