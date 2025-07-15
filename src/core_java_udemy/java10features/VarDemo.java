package core_java_udemy.java10features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarDemo {
    public static void main(String[] args) {
        var x = 20;
        var y = "Strng";
        var map = new HashMap<String, List<String>>();
        map.put("D", Arrays.asList("30","43"));
        for(var entry:map.entrySet()){
            System.out.println(entry);
        }
        //var s = null;
        Consumer<Integer> l = (i) ->{
                var z = 10;
                System.out.println(i);
        };

    }
}
