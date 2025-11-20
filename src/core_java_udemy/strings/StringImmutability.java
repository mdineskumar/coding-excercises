package core_java_udemy.strings;

public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        int hashcode_str=System.identityHashCode(str);
        int hashcode_str2 = System.identityHashCode(str2);
        System.out.println(hashcode_str);
        System.out.println(hashcode_str2);
        System.out.println("Before===");
        System.out.println(str);
        System.out.println(str2);
        str += " WOrld";
        System.out.println(hashcode_str);
        System.out.println(hashcode_str2);
        System.out.println("After");
        System.out.println(str);
        System.out.println(str2);

    }
}
