package designpattern.composite;

import java.util.Iterator;

public class MenuItems extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItems(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print(" "+getName());
        if(isVegetarian()) {
            System.out.print("(v)");
        }

        System.out.println(", "+getPrice());
        System.out.println("   -- "+getDescription());
    }

    public Iterator createIterator() {
        return new NullIterator();
    }


}
