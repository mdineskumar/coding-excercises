package datastructure.linked_list;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //insert val using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            //temp.next = node;
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //questions
    public void duplicates() {
        Node temp = head;

        while (temp.next != null) {

            if (temp.value != temp.next.value) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
                size--;
            }

        }
        tail = temp;
        tail.next = null;
    }

    public void duplicatesRecursion(){
        rec(head);
    }

    public void rec(Node head){
        if(head == null || head.next == null){
            return;
        }
        if (head.value != head.next.value) {
            rec(head.next);
        }else{
            head.next = head.next.next;
            rec(head);
        }

    }

    //merge linkedlists
    public LL mergeTwoLists(LL list1, LL list2){

        Node dummy = new Node(-1);
        Node head = dummy;

        Node f = list1.head;
        Node s = list2.head;
        LL ans = new LL();

        while(f != null && s != null) {
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;

            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f !=  null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;

    }



    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.display();
        list.duplicatesRecursion();
        list.display();


        //merge test
        LL list1 = new LL();
        LL list2 = new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

//        list2.insertLast(1);
//        list2.insertLast(3);
//        list2.insertLast(4);
//        list2.insertLast(5);
//        list2.insertLast(6);
        list1.display();
        list2.display();

        LL ans = list1.mergeTwoLists(list1,list2);

        ans.display();




    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
