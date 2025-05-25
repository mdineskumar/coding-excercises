package designpattern.singleton.assignment1;

import java.util.Date;

public class Logger implements Cloneable{
    private static volatile Logger instance;

    private Logger(){}

    public Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

    @Override
    protected Object clone(){
        return new CloneNotSupportedException();
    }

}