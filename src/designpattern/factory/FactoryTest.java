package designpattern.factory;

public class FactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("chicken");
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veg");

    }
}
