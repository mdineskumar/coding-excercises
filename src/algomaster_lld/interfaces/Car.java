package algomaster_lld.interfaces;

//implementing an interface using the implements keyword
public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
