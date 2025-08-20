package designpattern.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int current= 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return current < menuItems.size() && menuItems.get(current) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(current);
        current++;
        return menuItem;
    }
}
