package core_java_udemy.inheritance.inheritanceconcepts;

public class ChildClass extends SuperClass{

    ChildClass(){
        this(10);
        System.out.println("no arg childclass construct");
    }

    ChildClass(int x){
        super(x);
        System.out.println("One arg childclass constructor");
    }

    public static void main(String[] args){
        ChildClass c = new ChildClass();

    }
}
