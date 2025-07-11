package core_java_udemy.java8features.lambdas.parameters;

public class SumTest {
    public static void main(String[] args) {
        Sum s1  = new SumImple();
        System.out.println(s1.add(1,3));

        Sum s = (a,b)-> a+b;
        System.out.println(s.add(30,10));
    }
}
