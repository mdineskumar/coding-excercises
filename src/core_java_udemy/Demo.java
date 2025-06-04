package core_java_udemy;

public class Demo {
    static Demo obj = new Demo();

    Demo obj2= new Demo();

    static {
        System.out.println(obj);
        //System.out.println(this.obj2);
        Demo.init();

    }

    static void init(){
        obj = new Demo();
       // this.obj2 = new Demo();
    }

    public static void main(String[] args) {
        System.out.println(Demo.obj);
    }
}
