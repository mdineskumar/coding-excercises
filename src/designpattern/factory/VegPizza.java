package designpattern.factory;

public class VegPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing veg pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking veg pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting veg pizza");

    }
}
