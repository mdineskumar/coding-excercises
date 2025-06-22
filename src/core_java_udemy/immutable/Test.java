package core_java_udemy.immutable;

public class Test {
    public static void main(String[] args) {
        User user = new User(1,"Hohn");
        System.out.println(user);

        //immutable
        String s = new String("DInes");
        System.out.println(s);

        Integer i = new Integer(30);
        System.out.println(i);

    }
}
