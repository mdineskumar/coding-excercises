package algomaster_lld.polymorphism.method_overriding;

public class example {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();//upcasting
        myAnimal.makeSound();

        myAnimal = new Cat();//dynamic method dispatch
        myAnimal.makeSound();

    }
}

class Animal {
    void makeSound() {
        System.out.println("animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
