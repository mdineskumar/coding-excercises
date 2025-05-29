package designpattern.decorator.udemy;

public class VegiePizzaDecorator extends PizzaDecorator{

    public VegiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        addVeggieTopping();
    }

    private void addVeggieTopping() {
        System.out.println("adding veggie toppings");
    }

}
