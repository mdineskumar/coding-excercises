package core_java_udemy.strings.immutable;

public class Test {
    public static void main(String[] args) {
        User user = new User(1,"John");
        System.out.println(user);


        String s = new String("DInes");
        System.out.println(s);
        String s1  = "abc";
        String s4 = new String("abc");

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}
