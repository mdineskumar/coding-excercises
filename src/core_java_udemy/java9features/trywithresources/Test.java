package core_java_udemy.java9features.trywithresources;

public class Test {
    public static void main(String[] args) {
        MyWorker worker = new MyWorker();
        try(worker){
            worker.doSomething();
        }catch (Exception e){

        }
    }
}
