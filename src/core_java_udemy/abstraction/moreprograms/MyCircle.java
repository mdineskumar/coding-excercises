package core_java_udemy.abstraction.moreprograms;

public class MyCircle implements Circle, CircleTwo{

    @Override
    public void calculateArea() {

    }

    public static void main(String[] args) {
        //pi = 3.14f;
        System.out.println(CircleTwo.pi);//qualified pi because there is two pi
    }


}
