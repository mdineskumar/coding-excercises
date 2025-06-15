package designpattern.decorator.udemy;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza= new VegiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}
