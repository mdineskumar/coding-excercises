package oop.lecture9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTaskDemo {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        FactorialTask task = new FactorialTask(-5);
        Future<Integer> future = executorService.submit(task);
        //how static variable
        Integer result;
        try {
            result = future.get().intValue();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);

    }
}
