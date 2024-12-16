package leetcode;

public class mergedList {


    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid  = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }

    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            }else{
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }

        // if(list1 != null){
        //     node.next = list1;
        // }

        // if(list2 != null){
        //     node.next = list2;
        // }
        node.next = (list1 != null) ? list1:list2;
        return dummy.next;

    }

}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
