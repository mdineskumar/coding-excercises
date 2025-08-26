package designpattern.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }



    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
