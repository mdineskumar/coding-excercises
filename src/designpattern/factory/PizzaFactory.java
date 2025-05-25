package designpattern.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        Pizza p = null;
        if(type.equals("cheese")){
            p = new CheesPizza();
        } else if (type.equals("chicken")) {
            p = new ChickenPizza();
        }else if(type.equals("veg")){
            p = new VegPizza();
        }
        return p;
    }
}
