package core_java_udemy.java11features;

import java.util.stream.Collectors;

public class StringAPIUpdates {
    public static void main(String[] args) {
        //isBlank
        String str = "        ads";
        System.out.println(str.isBlank());
        //lines method
        str = " I\nam th \ncreator of my destiny";
        System.out.println(str.lines().collect(Collectors.toList()));
    }
}
