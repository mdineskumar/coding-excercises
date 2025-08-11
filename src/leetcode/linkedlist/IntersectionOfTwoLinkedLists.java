package leetcode.linkedlist;

import java.util.List;
import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectNodeUsingHashSet(ListNode headA, ListNode headB) {
        HashSet<ListNode> bucket = new HashSet<>();

        //traverse through the first list and add its nodes to the hashset
        ListNode a = headA;
        while(a != null) {
            bucket.add(a);
            a = a.next;
        }

        //traverse through the second list and check if any node is in the hashset
        ListNode b = headB;
        while(b != null) {
            if(bucket.contains(b)){
                return b;//found intersection
            }
            b = b.next;
        }

        return null;//no intersection found
    }

    public ListNode getIntersectNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
       // ListNode currentB = headB;

        while (currentA != null) {
            ListNode currentB = headB;
            //need to iterate through B check any curent element next point to same value
            while(currentB != null) {

                if(currentB == currentA) {
                    return currentA;
                }
                //change currentB to next element
                currentB = currentB.next;
            }
            currentA = currentA.next;
        }
        return null;
    }

    public ListNode getIntersectNodeRunnerMethod(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if( a == null || b == null) {
            return null;
        }
        int count = 0;
        //traverse the both until they meet intersection or end of list
        while(a != b){
            a = (a==null) ? headB:a.next; //if a come to end their path then jump to b path.
            b = (b==null) ? headA:b.next;//same
            count++;
        }

        System.out.println(count);
        return a;

    }


    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
        ListNode node8 = new ListNode(8,new ListNode(4,new ListNode(5)));

        ListNode headA = new ListNode(4,new ListNode(1,node8));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1,node8)));


        System.out.println(intersectionOfTwoLinkedLists.getIntersectNode(headA,headB));
        System.out.println(intersectionOfTwoLinkedLists.getIntersectNodeUsingHashSet(headA,headB));
        System.out.println(intersectionOfTwoLinkedLists.getIntersectNodeRunnerMethod(headA,headB));

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode(int x, ListNode next) {
        val = x;
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

