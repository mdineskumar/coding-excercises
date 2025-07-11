package core_java_udemy.concurrentcollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraySetProblem extends Thread {
    static HashSet<String> courses = new HashSet<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        courses.add("Kubernetes");
    }

    public static void main(String[] args) throws InterruptedException {

        ArraySetProblem arrayListProblem = new ArraySetProblem();
        arrayListProblem.start();

        courses.add("java");
        courses.add("python");
        courses.add("aws");
        courses.add("docker");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            Thread.sleep(2000);
            String course = iterator.next();
            System.out.println(course);

//            courses.add("Node");
        }

        System.out.println(courses);

    }
}
