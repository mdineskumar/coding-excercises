package designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class ReflectionProblem {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        Constructor[] constructors =  DateUtil.class.getDeclaredConstructors();
        for(Constructor c: constructors){
           c.setAccessible(true);
           dateUtil2 = (DateUtil) c.newInstance();
           break;
        }
        System.out.println(dateUtil1.hashCode() );
        System.out.println(dateUtil2.hashCode() );


    }
}
