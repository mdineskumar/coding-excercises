package designpattern.decorator;

public class Milk extends ContimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
