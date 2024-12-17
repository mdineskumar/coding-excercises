package leetcode.question19;

import javax.swing.*;

public class Solution {
    public void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println(" END");
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //we need to find the Nth node from head
        if(head == null){
            return head;
        }
        if(head.next == null){
            head = null;
            return head;
        }

        ListNode dummyStart = new ListNode(-1,head);

        ListNode ptr1 = dummyStart;
        ListNode current = dummyStart;
        while(n > 0){
            ptr1 = ptr1.next;
            n--;
        }

        if(ptr1 == null){

        }else{
            //move two pointers head and ptr1 util ptr1.next null -> this will ensure the head pointer come to Nth position from end of the list
            while(ptr1.next != null){
                current = current.next;
                ptr1 = ptr1.next;

            }
            System.out.println("Nth node from head: "+ptr1.val);
        }

//        if(current == head){
//            if(ptr1 != null){
//                head.next = ptr1.next;
//
//            }else{
//                ListNode removed = head;
//                head = head.next;
//                removed.next = null;
//            }
//
//        }else{
//            //remove the element
//
//        }
        ListNode removeElement = current.next;
        ListNode nextElementFromRemoved = removeElement.next;
        current.next = nextElementFromRemoved;
        System.out.println("Nth node from end of the list: "+current.val);


        return dummyStart.next;
    }
}

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class TestSolution{
    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode node1 = new ListNode(1);
//        //,new ListNode(5,new ListNode(7,new ListNode(4,new ListNode(9))))
//        solution.printList(node1);
//        ListNode resultAfterRemove = solution.removeNthFromEnd(node1,1);
//        solution.printList(resultAfterRemove);
//
        //test case [1,2]
//        ListNode node1 = new ListNode(1,new ListNode(2));
//        //,new ListNode(5,new ListNode(7,new ListNode(4,new ListNode(9))))
//        solution.printList(node1);
//        ListNode resultAfterRemove = solution.removeNthFromEnd(node1,1);
//        solution.printList(resultAfterRemove);

        //test case [1,2,3]
        ListNode node1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        //,new ListNode(5,new ListNode(7,new ListNode(4,new ListNode(9))))
        solution.printList(node1);
        ListNode resultAfterRemove = solution.removeNthFromEnd(node1,2);
        solution.printList(resultAfterRemove);

    }
}
