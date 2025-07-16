package core_java_udemy.java10features;

import java.util.*;
import java.util.function.Consumer;

public class VarDemo {
    //var str = "sinte";

    public static void main(String[] args) {
        var x = 20;
        var y ="dines";
        y = "Dines";
        //y = 145;

        var map = new HashMap<String, List<String>>();
        map.put("D", Arrays.asList("30","43"));
        for(var entry:map.entrySet()){
            System.out.println(entry);
        }
        //var s = null;
        Consumer<Integer> l = (i) ->{
                var z = 10;//can add var variables
                System.out.println(i);
        }; //cant change var

        var list = new ArrayList<Integer>();
        list.add(1);
        //list.add("DUT");

    }
}
