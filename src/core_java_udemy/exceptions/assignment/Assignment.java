package core_java_udemy.exceptions.assignment;

class MyThreadException extends RuntimeException{
    public MyThreadException(String message) {
        super(message);
    }
}

public class Assignment {

   static void tryCatch(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("interrrupted exception");
            throw new MyThreadException("my custom exception");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2000);

        tryCatch();
    }
}
