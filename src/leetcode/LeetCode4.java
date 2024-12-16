package leetcode;

public class LeetCode4 {

    public long findNumber(ListNode l1){
        int pos = 0;
        long number = 0;
        while(l1 != null){
            number += Math.pow(10,pos) * l1.val;
            pos++;
            l1 = l1.next;
        }

        return number;
    }
    public ListNode addTwoNumbersUsingSum(ListNode l1, ListNode l2) {
        long num1 = findNumber(l1);
        long num2 = findNumber(l2);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        long result = num1 + num2;
        System.out.println("num1 + num2 = "+result);

        long n = result;
        ListNode node = new ListNode(-1);
        ListNode temp = node;
        do{
            long digit = (n % 10);
            node.next = new ListNode((int) digit);
            node = node.next;
            n = n/10;
            System.out.println(digit);
        }while (n != 0);


        return temp.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(-1); // we need to point the start node when give result
        ListNode current = dummyHead; // current node used for store result
        while(l1 != null || l2 != null){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2!= null){
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode r = new ListNode(sum%10);
            current.next = r;
            current = current.next;
            carry = sum/10;
        }

        return dummyHead.next;
    }


    public void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println(" END");
    }


}


class LeetCode4TestDrive{
    public static void main(String[] args) {
        LeetCode4 leetCode4 = new LeetCode4();
        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(4);
//        ListNode l3 = new ListNode(3);
//        l1.next = l2;
//        l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(9);
        ListNode l13 = new ListNode(9);

        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;
        l11.next = l12;
        l12.next = l13;

        leetCode4.printList(l4);
        leetCode4.printList(l1);

        //ListNode r1 = leetCode4.addTwoNumbersUsingSum(l1,l4);//it fail when number is greater tha 2^64 - 1
        ListNode r2 = leetCode4.addTwoNumbers(l1,l4);

        leetCode4.printList(r2);


    }


}
