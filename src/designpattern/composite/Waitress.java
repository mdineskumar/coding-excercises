package designpattern.composite;


import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void printMenu() {
        allMenus.print();
    }

    public void printVegetarian() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while(iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try{
                if(component.isVegetarian()){
                    component.print();
                }
            }catch (UnsupportedOperationException e){}


        }

    }


}
