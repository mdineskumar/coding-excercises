package leetcode.linkedlist;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedList {
    ListNode removeDuplicate(ListNode head) {
        ListNode key = head; //it same as key
        while(key.next != null) {

            ListNode current = key.next; //this runner //it checks for duplicates key

            while(current.next != null){
                if(key.val == current.next.val) {
                    //found duplicates
                    current.next = current.next.next;
                    continue;
                }
                current = current.next;
            }

            key= key.next;
        }

        return null;
    }

    //using hashtable
    ListNode removeDuplicateUsingHashTable(ListNode head) {
        //logic correct but contains() method is wrong use and Hashtable also incorrect we can use Hashset
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ListNode current = head;
        if(current!=null){
            ht.put(current.val,1);
            while(current.next!=null){
                if(!ht.containsKey(current.next.val)) {
                    ht.put(current.next.val,1);
                    current =current.next;
                }else{
                //need to remove
                    current.next = current.next.next;
                }
            }
        }

        return head;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5)))))));

        RemoveDuplicatesFromUnsortedList rm = new RemoveDuplicatesFromUnsortedList();
        ListNode head1 = rm.removeDuplicateUsingHashTable(head);

        if(head1 == null) return;
        while(head1.next != null) {
            System.out.print(head1.val + " -> ");
            head1 = head1.next;
        }
        System.out.println(head1.val);

    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }



}
