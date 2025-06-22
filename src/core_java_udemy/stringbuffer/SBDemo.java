package core_java_udemy.stringbuffer;

public class SBDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("capacity: " + sb.capacity());
        sb.append("All the power within you.");
        sb.append("You can do anything and everything.");

        System.out.println(sb);
        System.out.println("current capacity: "+sb.capacity());

        System.out.println(sb.charAt(10));

        StringBuffer sb2 = new StringBuffer("abcde");
        System.out.println(sb.reverse());

        System.out.println(sb2.insert(1,"xyz"));

        System.out.println(sb2.delete(1,4));
    }
}
