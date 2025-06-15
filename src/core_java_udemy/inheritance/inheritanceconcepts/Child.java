package core_java_udemy.inheritance.inheritanceconcepts;

public class Child extends Parent{
    int c,d;

    Child(int a, int b, int c, int d){
        super(a,b);
        this.c = c;
        this.d = d;
    }

    void displayDetails(){
        System.out.println("Parent a: " + super.a);
        System.out.println("Parent b: " + super.b);
        System.out.println("Child c: " + this.c);
        System.out.println("Child d: " + this.d);
    }
    @Override
    void f1() {
        super.f1(); //add parent functionalities
        System.out.println("Child f1 method");
        System.out.println(this);
        //System.out.println(super);//pointer to instance for parent

    }
}
