package designpattern.iterator;

public class DinerMenuIterator implements Iterator{

    MenuItem[] menuItems;
    int current= 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return current < menuItems.length && menuItems[current] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[current];
        current++;
        return menuItem;
    }
}
