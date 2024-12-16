package leetcode;

public class CycleQuestions {
    public boolean hasCycle(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;


        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }

        return false;

    }

    //find length of cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;


        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                //there is cycle
               int counter = 0;

//               while(){
//                   slowPointer = slowPointer.next;
//                   counter++;
//
//               }
               do {
                   slowPointer = slowPointer.next;
                   counter++;
               }while (slowPointer != fastPointer);
               return counter;
            }
        }

        return 0;

    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}




