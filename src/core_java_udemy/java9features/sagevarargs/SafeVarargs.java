package core_java_udemy.java9features.sagevarargs;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarargs {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("abc","xyz");
        List<String> l2 = Arrays.asList("nmo","pqr");

        //myMethod(l1,l2);

        SafeVarargs sva = new SafeVarargs();
        sva.myMethod(l1,l2);
    }

    @java.lang.SafeVarargs
    private void myMethod(List<String>...l){
        Object [] objects = l;
        objects[0] = Arrays.asList(1,2);

        //dirty heap pooling
        String name = (String)l[0].get(0);
        System.out.println(name);


    }

}
