package core_java_udemy.immutable;

public class ImmuatableDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Before Concat: "+"\n s1: "+s1+"\n s2: "+s2);

        //create new string
        s2 = s1.concat(s2);

        System.out.println("After Concat: "+"\n s1: "+s1+"\n s2: "+s2);

    }
}
