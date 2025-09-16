package designpattern.composite;

import javax.management.Descriptor;

public class Leaf extends Component{
    String name;
    String description;

    public Leaf(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    void operation() {
        //printing menus
        System.out.println("Name: "+name+" Description: "+ description);

    }
}
