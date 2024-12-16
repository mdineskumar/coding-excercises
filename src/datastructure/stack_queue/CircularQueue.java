package datastructure.stack_queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;

    private int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];

    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    boolean isFull() {
        //ptr is at last index
        return size == data.length;
    }

    protected boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        int i = front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;

        }while(i != end);
//        for (int i = front; i <  data.length - end; i++) {
//            System.out.print(data[i] + " ");
//        }

        System.out.println("END");

    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);
        queue.display();
        queue.remove();
        queue.display();
        queue.insert(133);
        queue.display();
    }



}
