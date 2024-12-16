package designpattern.decorator;

public class Espresson extends Beverage{

    public Espresson() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
