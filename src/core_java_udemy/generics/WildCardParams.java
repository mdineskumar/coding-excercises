package core_java_udemy.generics;

import java.util.ArrayList;

public class WildCardParams {

    public static void main(String[] args) {
        WildCardParams wildCardParams = new WildCardParams();
        wildCardParams.myMethod(new ArrayList<A>());

    }
    public void myMethod(ArrayList<? super B> l){
        l.add(null);
//        l.add("DInes");
        //l.add(new MyClass());
        l.add(new B());
    }
}
