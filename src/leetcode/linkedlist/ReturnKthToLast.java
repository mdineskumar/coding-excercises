package leetcode.linkedlist;

public class ReturnKthToLast {

    private ListNode ReturnKthElementToLast(int k, ListNode head){
        //using two pointers
        ListNode p1 = head;
        ListNode p2 = head;

        while(p2 != null && k > 0){
            p2 = p2.next;
            k--;
        }

        while(p2 != null && p2.next != null && p1 != null) {
            p1 = p1.next;
            p2 = p2.next;

        }

        return p1;

    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5)))))));
        ReturnKthToLast returnKthToLast = new ReturnKthToLast();
        ListNode kthNode = returnKthToLast.ReturnKthElementToLast(2, head);
        System.out.println(kthNode);

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
