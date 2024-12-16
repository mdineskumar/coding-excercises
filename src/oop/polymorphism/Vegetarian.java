package oop.polymorphism;

public interface Vegetarian {
}

class Animal{

}

class Deer extends Animal implements Vegetarian{

}


class Forrest{
    public static void main(String[] args) {
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;

        //Deer d1 = new Animal();
    }
}
