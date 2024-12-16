import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(4);
        linkedList.insertFirst(6);
        linkedList.insertFirst(412);
        linkedList.insertFirst(41);
        linkedList.insertFirst(-4);

        linkedList.insertLast(99);
        linkedList.insert(100, 3);

//        linkedList.deleteFirst();
//
        linkedList.display();
//        linkedList.deleteLast();
//        linkedList.display();
//
//        linkedList.delete(2);
//        linkedList.display();
//
//        linkedList.find(6);
//
//
//        DoublyLL doublyLL = new DoublyLL();
//
//        doublyLL.insertFirst(8);
//        doublyLL.insertFirst(3);
//        doublyLL.insertFirst(2);
//        doublyLL.insertFirst(5);
//        doublyLL.display();
//        doublyLL.insertLast(9);
//        doublyLL.insertLast(10);
//        doublyLL.insertLast(20);
//        doublyLL.insertLast(-1);
//        doublyLL.display();
//
//        doublyLL.insert(-1,47);
//        doublyLL.display();
//
//
//        CircularLL circularLL = new CircularLL();
//        circularLL.insert(87);
//        circularLL.insert(67);
//        circularLL.insert(89);
//        circularLL.insert(100);
//        circularLL.delete(89);
//        circularLL.display();

        linkedList.insertRec(22,2);
        linkedList.display();



    }
}