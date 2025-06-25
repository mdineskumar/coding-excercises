package core_java_udemy.immutable;

public class StringPoolDemo {
    public static void main(String[] args) {
        User user1 = new User(1,"ABC");
        User user2 = new User(2,"ABC");
        System.out.println(user1);
        System.out.println(user2);

        String s1 = "abc";
        String s2 = "xyz";
        String s3 = "abc";
        //new memory location doesnot reuse in string pool
        String s4 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
//        s1 = "abd";
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
