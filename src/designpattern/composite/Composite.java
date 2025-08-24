package designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends Component{
    ArrayList<Component> components = new ArrayList<>();
    String title;
    String description;



    public Composite(String title, String description) {
        this.description = description;
        this.title = title;
    }

    @Override
    void operation() {

        Iterator<Component> iterator = components.iterator();
        while(iterator.hasNext()) {
           Component component =  (Component)iterator.next();
           component.operation();
        }
    }

    @Override
    void add(Component component) {
        components.add(component);
    }

    @Override
    void remove(Component component) {
       components.remove(component);
    }

    @Override
    Component getChild(int i) {
        return components.get(i);
    }
}
