package core_java_udemy.innerclasses.nonstaticinnerclasses;

public class Outer {
    private static int x = 59;
    private int y;

    public Outer(int y) {
        this.y = y;
    }

    void f1(){
        System.out.println("Outer non static method");
    }
    class Inner{
        private int y;

        public Inner(int y) {
            this.y = y;
        }

        void f2(){
            System.out.println("Non static inner classes  non static method");
            System.out.println("Outer classes X: "+Outer.x);
            System.out.println("Outer classes y: "+Outer.this.y);
            System.out.println("Outer classes y: "+this.y);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(50);
        outer.f1();

        Outer.Inner inner = outer.new Inner(30);
        inner.f2();
    }
}
