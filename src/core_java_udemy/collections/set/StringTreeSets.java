package core_java_udemy.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("absc");
        set.add("aaxq");
        set.add("zyxqqwerty");
        set.add("zyxqqwertytyur");

        for (String str:
             set) {
            System.out.println(str);
        }

        Set<StringBuffer> setOfStringBuffer = new TreeSet<>();

        setOfStringBuffer.add(new StringBuffer("absc"));
        setOfStringBuffer.add(new StringBuffer("aaxq"));
        setOfStringBuffer.add(new StringBuffer("zyxqqwerty"));
        setOfStringBuffer.add(new StringBuffer("zyxqqwertytyur"));

        for (StringBuffer str:
                setOfStringBuffer) {
            System.out.println(str);
        }

    }
}
