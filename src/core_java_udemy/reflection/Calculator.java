package core_java_udemy.reflection;

@MyAnnotation(value1 = "123",value2 = "456")
public class Calculator {

    private double num1;
    private double num2;
    public Calculator(double a, double b) {
        System.out.println("Calculator constructor");
        this.num1 = a;
        this.num2 = b;
    }

    public Calculator() {
        System.out.println("calculator default constructor");
    }

    public double sum(double a, double b){
        return a+b;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
