package algomaster_lld.inheritance;

public class Animal {
    String name;
    void eat(){
        System.out.println(name + " is eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(name+" is barking...");
    }
}


class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
                dog.name = "buddy";
                dog.eat();//inherited from Animal class
                dog.bark();//defined in Dog class
    }
}