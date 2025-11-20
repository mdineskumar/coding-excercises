package oop.lecture9;

import java.security.InvalidParameterException;
import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
    private int number;
    public FactorialTask(int num) {
        this.number = num;
    }
    @Override
    public Integer call() throws InvalidParameterException {
        if(number<0) {
            throw new InvalidParameterException("Number should be positive");
        }

        return 10;
    }
}

