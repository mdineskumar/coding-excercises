package designpattern.decorator.udemy;

public class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
