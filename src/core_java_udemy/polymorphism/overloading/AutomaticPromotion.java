package core_java_udemy.polymorphism.overloading;

public class AutomaticPromotion {

    public void print(int i){
        System.out.println("Inrger versionL: "+i);
    }
        //if only one called if integer version not exist
    //go to immediate type match
    public void print(float i){
        System.out.println("Float versionL: "+i);
    }

    public void print(String s){
        System.out.println("String version");
    }

    public void print(Object obj){
        System.out.println("Object version");
    }
    public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print(123);
        ap.print(10.5f);

        ap.print("Hello");
        //ap.print();
    }
}
