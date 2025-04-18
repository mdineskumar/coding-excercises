package recursion.leetcode_questions;

public class MergedTwoSortedList {
    public static ListNode mergeTwoList(ListNode list1, ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val <= list2.val){
            list1.next = mergeTwoList(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoList(list1, list2.next);
            return list2;
        }
    }
    public ListNode mergeTwoListIterative(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1,null);
        ListNode result = head;


        while(list1 != null || list2 != null){
            if(list1 == null){
                head.next = list2;
                return result.next;
            }
            else if(list2 == null){
                head.next = list1;
                return result.next;
            }
            else if(list1.val < list2.val){
                head.next= list1;
                head = head.next;
                list1 = list1.next;
            }else{
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }

        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3,new ListNode(4)));
        ListNode result = mergeTwoList(list1,list2);
        while(result != null){
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

