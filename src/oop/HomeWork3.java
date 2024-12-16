package oop;

class A {
    public int publicAccess;
    private int privateAccess;

    protected int protectedAccess;

    int defaultAccess;


    public A() {
        super();
        defaultAccess = 18;
        printType();

    }

    static void printType(){
        System.out.println("I'm type of A");
    }
}

class B extends  A{

    int defaultAccess = 20;

    public B() {
        printType();
    }

    void check(){
        int a = this.defaultAccess;
        int b = this.protectedAccess;
        int c = this.publicAccess;

        //int d = this.privateAccess;//cant be access from subclass
    }

    void print(){
        System.out.println("DfaultAcess: "+defaultAccess);
    }

    static void printType(){
        //super.printType();
        System.out.println("I'm type of B");
    }
}

class C{
    public static void main(String[] args) {
        B b = new B();
        //b.print();
        //B.printType();
    }
}
