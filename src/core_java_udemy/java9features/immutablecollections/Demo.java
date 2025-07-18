package core_java_udemy.java9features.immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        List<String> a = List.of("A", "B", "C");
        Set<String> set = Set.of("abc", "cde", "tie;");
//        Map.of();
//        Map.ofEntries()
        a.add("S");
        set.add("r");
    }
}
