package datastructure.linked_list;

public class DoublyLL {
    Node head;
    Node tail;
    int size = 0;

    public DoublyLL() {}

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null){
            //list is empty
            head.prev = node;
        }

        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        node.prev = last;
        last.next = node;
    }

    public void insert(int after, int val) {
        Node trav = find(after);

        if (trav == null){
            return;
        }
        Node node = new Node(val);

        node.prev = trav;
        node.next = trav.next;
        if (trav.next != null){
            trav.next.prev = node;
        }
        trav.next = node;

       // trav.next.prev = node;

    }

    public Node find(int value){
        Node node = head;

        while( node != null ){
            if ( node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse.");
        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");

    }



    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
