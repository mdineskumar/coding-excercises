package designpattern.decorator.udemy;

public class CheesePizzaDecorator extends PizzaDecorator{

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        addVeggieTopping();
    }

    private void addVeggieTopping() {
        System.out.println("adding Cheese toppings");
    }

}
