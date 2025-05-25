package designpattern.factory.assignment;

public class Female implements Person{
    @Override
    public void wish(String msg) {

        System.out.println("Female wish:"+msg);
    }
}
