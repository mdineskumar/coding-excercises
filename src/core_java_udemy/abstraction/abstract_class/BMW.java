package core_java_udemy.abstraction.abstract_class;

public abstract class BMW {
    void commonFunc(){
        System.out.println("inside common functionalities");
    }

    abstract void acclerate();
    abstract void brake();

    public static void main(String[] args) {
        System.out.println("inside the main method");

    }
}
