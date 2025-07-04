package core_java_udemy.java8features.lambdas.parameters;

public class SumTest {
    public static void main(String[] args) {
        Sum s = (a,b)-> System.out.println("sum is: "+(a+b));
        s.add(19,10);
    }
}
