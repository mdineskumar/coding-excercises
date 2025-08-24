package designpattern.composite;

public abstract class Component {

    void operation() {
        throw new UnsupportedOperationException();
    }

    void add(Component component) {
        throw new UnsupportedOperationException();
    }
    void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

}
