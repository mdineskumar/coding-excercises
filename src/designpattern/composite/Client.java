package designpattern.composite;

import core_java_udemy.access_modifiers.p2.C;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("Root","Start of the tree");
        Component child1 = new Composite("level-1","Composite Component");
        Component child2 = new Composite("level1","another component");
        Component leaf1 = new Leaf("leaf1","leaf component");
        Component leaf2  = new Leaf("leaf2","leaf component");
        Component leaf3  = new Leaf("leaf3","leaf component");

        child1.add(leaf1);
        child2.add(leaf2);
        root.add(leaf3);
        root.add(child1);
        root.add(child2);

        root.operation();
    }
}
