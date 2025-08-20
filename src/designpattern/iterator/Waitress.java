package designpattern.iterator;
import java.util.ArrayList;
public class Waitress {
    String name;

    void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.toString());
        }

        for (int j = 0; j < lunchItems.length; j++) {
            MenuItem menuItem = lunchItems[j];
            if(menuItem != null){
                System.out.println(menuItem.toString());
            }

        }

    }


}
