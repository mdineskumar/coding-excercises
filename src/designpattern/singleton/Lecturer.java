package designpattern.singleton;

public class Lecturer {
    private static Lecturer instance;

    private Lecturer() {}

    public static Lecturer getInstance() {
        if(instance == null) {

            instance = new Lecturer();

        }
        return instance;
    }

    //double checking lock
    public static Lecturer getInstanceDoubleLock() {
        if(instance == null) {
            synchronized (Lecturer.class) {
                if(instance == null) {
                    instance =new Lecturer();
                }
            }
        }
        return instance;
    }
}
