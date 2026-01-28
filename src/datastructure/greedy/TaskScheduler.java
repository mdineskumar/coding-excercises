package datastructure.greedy;

import java.util.*;

public class TaskScheduler {

    private int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        //step1: count the frequency of each task
        for (int i = 0; i < tasks.length; i++) {
            frequencyMap.put(tasks[i],frequencyMap.getOrDefault(tasks[i],0) + 1);
        }

        //step 2: Initializes a max heap based on task frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(frequencyMap.values());
        System.out.println("Max Heap: "+maxHeap.toString());

        //step 3: Track tasks which are in the cooldown period
        Queue<Map.Entry<Integer,Integer>> cooldownQueue = new LinkedList<>();
        int time = 0;

        //step 4: simulate time units
        while(!maxHeap.isEmpty() || !cooldownQueue.isEmpty()) {
            time++;

            System.out.println("Cooldown Queue: "+cooldownQueue.toString());
            System.out.println("Maxheap: "+maxHeap.toString());
            if(!maxHeap.isEmpty()) {
                int currentFreqTask = maxHeap.poll() - 1;

                if(currentFreqTask > 0) {
                    cooldownQueue.offer(new AbstractMap.SimpleEntry<>(currentFreqTask, time + n));
                }
            }

            //step 5: check cooldown queue if any task is ready to re-enter the max heap
            // any tasks are available for after cool down period
            if(!cooldownQueue.isEmpty() && cooldownQueue.peek().getValue() == time) {
                maxHeap.offer(cooldownQueue.poll().getKey());
            }
            System.out.println("Cooldown Queue: "+cooldownQueue.toString());
            System.out.println("Maxheap: "+maxHeap.toString());

        }

        return time;
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        char[] tasks1=new char[] {'A','A','A','B','B','B'};
        char[] tasks2 = "ACABDB".toCharArray();
        char[] tasks3 = "AAABBB".toCharArray();

        System.out.println(Arrays.toString(tasks1)+"==>"+ts.leastInterval(tasks1, 2));
        System.out.println(Arrays.toString(tasks2)+"==>"+ts.leastInterval(tasks2, 1));
        System.out.println(Arrays.toString(tasks3)+"==>"+ts.leastInterval(tasks3, 3));
    }
}
