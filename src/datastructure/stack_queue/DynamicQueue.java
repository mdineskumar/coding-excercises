package datastructure.stack_queue;

public class DynamicQueue extends CircularQueue{


    public DynamicQueue(int size) {
        super(size);

    }

    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            //double the size
            int[] temp = new int[data.length *2];

            //copy all the previous items to new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);
        queue.insert(14);
        queue.display();
        queue.remove();
        queue.display();
        queue.insert(133);
        queue.display();
    }



}
