package core_java_udemy.mutlithreading.synchronization.threadgroups;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println("CurrentThread ThreadGroup: "+Thread.currentThread().getThreadGroup().getName());
        System.out.println("CurrentThread Parent ThreadGroup: "+Thread.currentThread().getThreadGroup().getParent().getName());


        ThreadGroup parent = new ThreadGroup("Parent");
        System.out.println("Parent THreadGroup parent TG: "+parent.getParent().getName());
        ThreadGroup child = new ThreadGroup(parent,"Child");
        System.out.println("Child THreadGroup parent TG: "+child.getParent().getName());
//        child.setMaxPriority(4);
        Thread thread1 = new Thread(child, "Thread1");
        Thread thread2 = new Thread(child,"THread2");
        System.out.println(thread1.getThreadGroup().getName());
        System.out.println(thread1.getPriority());

        child.setMaxPriority(4);

        System.out.println(thread1.getPriority());

        Thread thread3 = new Thread(child,"THread3");
        System.out.println(thread3.getPriority());


    }
}
