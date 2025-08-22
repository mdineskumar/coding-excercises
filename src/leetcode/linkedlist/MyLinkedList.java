package leetcode.linkedlist;

public class MyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        //check is there any elements in linkedlist
        if(index < 0 || index >= size) return -1;

        Node current = head;


        //iterate through linkedlist
        while(current.next != null && index > 0) {
            current = current.next;
            index--;
        }

        return current.val;

    }

    public void addAtHead(int val) {
        //check is head is null
//        if(head == null) {
//            head = new Node(val);
//            return;
//        }

        //if there is head add to next
        Node current = new Node(val);
        current.next = head;
        head = current;
        size++;
    }

    public void addAtTail(int val) {
        //check if linkedlist empty
        if(head==null) {
            head = new Node(val);
            size++;
            return;
        }
        //check only one element in the linkedlist
//        if(head.next == null) {
//            head.next = new Node(val);
//            return;
//        }
        //if morethan one element need to find tail
        Node newNode = new Node(val);
        Node current = head;

        while(current.next != null){
            current = current.next;

        }
        current.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
            if(index > size){
                return;
            }
            //check if linkedlist empty
//            if(head==null) {
//                head = new Node(val);
//                return;
//            }
        if(index <= 0){
            addAtHead(val);
            return;
        }
            //check only one element in the linkedlist
//            if(head.next == null) {
//                head.next = new Node(val);
//                return;
//            }
            //if morethan one element need to find index
            Node newNode = new Node(val);
            Node current = head;

//            Node prev = head;
//
//            while(current.next != null && index > 0){
//                prev = current;
//                current = current.next;
//                index--;
//            }
////            if(index != 0) {
////                //linkedlist length < index
////                return;
////            }
//            if(prev == current && prev == head){
//                //it is in the head
//                newNode.next = head;
//                head = newNode;
//                return;
//            }
//            prev.next = newNode;
//            newNode.next = current;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next= newNode;
        size++;

    }

    public void deleteAtIndex(int index) {
        if(index < 0||index >= size){
            return;
        }

        //check if linkedlist empty
//        if(head==null) {
//            return;
//        }
        //check only one element in the linkedlist
//            if(head.next == null) {
//                head.next = new Node(val);
//                return;
//            }
        //if morethan one element need to find index

//        Node current = head;
//        Node prev = head;
//
//        while(current.next != null && index > 0){
//            prev = current;
//            current = current.next;
//            index--;
//        }
////        if(index != 0) {
////            //linkedlist length < index
////            return;
////        }
//        if(prev == current && prev == head){
//            head = head.next;
//            return;
//        }
//        prev.next = current.next;

        if(index == 0) {
            head = head.next;
        }else{
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;

        }
        size--;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.addAtTail(1);
//         System.out.println(linkedList);
//         linkedList.addAtTail(2);
//         System.out.println(linkedList);
//        linkedList.addAtHead(4);
//        linkedList.addAtHead(3);
//        linkedList.addAtHead(5);
//        System.out.println(linkedList);

//        linkedList.addAtTail(8);
//        System.out.println(linkedList);
//        linkedList.addAtIndex(4,190);
//        System.out.println(linkedList);
//        linkedList.deleteAtIndex(1);
//        System.out.println(linkedList);
        //failed testcases
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.deleteAtIndex(0);
        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addAtIndex(0,10);
        System.out.println(linkedList2);
        linkedList2.addAtIndex(0,20);
        System.out.println(linkedList2);
        linkedList2.addAtIndex(1,30);
        System.out.println(linkedList2);
        System.out.println(linkedList2.get(0));


        MyLinkedList linkedList3 = new MyLinkedList();
        linkedList3.addAtHead(2);
        System.out.println(linkedList3);
        linkedList3.deleteAtIndex(1);
        System.out.println(linkedList3);

        MyLinkedList linkedList1 = new MyLinkedList();
        linkedList1.addAtTail(1);
        System.out.println(linkedList1);
        System.out.println(linkedList1.get(0));
    }

}
