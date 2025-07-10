package core_java_udemy.collections.map;

public class User {
    @Override
    public String toString() {
        return "User";
    }

    @Override
    protected void finalize() throws Throwable {
        //when garabage collect
        System.out.println("finalize called");
    }
}
