package core_java_udemy.concurrentcollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
    static Map<String,String> courseRatings = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        courseRatings.put("Kubernetes","3.5");
    }

    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
        arrayListProblem.start();

        courseRatings.put("java","5.0");
        courseRatings.put("python","4.8");
        courseRatings.put("aws","4.8");
        courseRatings.put("docker","4.9");

        Iterator<String> iterator = courseRatings.keySet().iterator();

        while(iterator.hasNext()){
            Thread.sleep(2000);
            String course = iterator.next();
            System.out.println(courseRatings.get(course));

//            courses.add("Node");
        }

        System.out.println(courseRatings);

    }
}
