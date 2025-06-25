package core_java_udemy.immutable.string;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Length of the string is: "+ s.length());

        System.out.println("indexOf : "+ s.indexOf('o'));
        System.out.println("charAt: "+s.charAt(3));
        //System.out.println("charAt: "+s.charAt(5));
        System.out.println("substring with begining index: "+s.substring(2));
        System.out.println("substring with begining index and end index: "+ s.substring(0,4));

        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }

        String replace = s.replace('l', 'k');
        System.out.println("Replace: " + replace);

        System.out.println("toUpperCase: "+s.toUpperCase());
        System.out.println("toLowerCase: "+s.toLowerCase());


    }
}
