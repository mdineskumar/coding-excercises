package designpattern.iterator;
import java.util.ArrayList;
public class Waitress {
    String name;
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("=====PANCAKEHOUSE MENU ITEMS=====");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("=====DINER MENU ITEMS=====");
        printMenu(dinerMenuIterator);


    }

    void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }


}
