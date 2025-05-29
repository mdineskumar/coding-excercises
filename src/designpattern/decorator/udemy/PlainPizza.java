package designpattern.decorator.udemy;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("bake plain pizza");
    }
}
