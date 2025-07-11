package core_java_udemy.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread {
    static List<String> courses = new CopyOnWriteArrayList<>();

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

        ArrayListProblem arrayListProblem = new ArrayListProblem();
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
