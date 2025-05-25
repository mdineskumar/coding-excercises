package designpattern.singleton;

import java.io.Serializable;
import java.util.Date;

public class DateUtil implements Serializable {
    //avoid issue in multithreaded enviornemnts
    private static volatile DateUtil instance;

    //static vblcks are excuted in memory
//    static {
//        instance = new DateUtil();
//    }
    private DateUtil(){
        //eager initialization
        //instance = new DateUtil();

    }

    //synchronized means it ensures only one thread execute at one time
    public static DateUtil getInstance(){
        if ( instance == null ){
            //lazy initialization
            synchronized (DateUtil.class){
                if(instance == null){
                    instance = new DateUtil();
                }

            }
        }
        return instance;
    }
//    public static synchronized DateUtil getInstance(){
//        //lazy initialization
//        synchronized (DateUtil.class){
//            if(instance == null){
//                instance = new DateUtil();
//            }
//            return instance;
//        }
//    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
