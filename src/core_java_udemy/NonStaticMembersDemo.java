package core_java_udemy;

public class NonStaticMembersDemo {
    int num;

    static NonStaticMembersDemo obj;
    //constructors
    NonStaticMembersDemo(int num) {
        this.num = num;
        System.out.println("inside the constructore");
    }
    //non static block
    {
        System.out.println("inside the non static block");
    }

    static {
        NonStaticMembersDemo.obj = new NonStaticMembersDemo(5);
        System.out.println("inside static block");
    }

    public static void main(String[] args) {
        System.out.println("inside the main method");
        NonStaticMembersDemo obj = new NonStaticMembersDemo(3);
        obj.doSomething();
    }

    void doSomething(){
        System.out.println("Inside doSomething");
    }


}
