package datastructure.stack_queue;

public class DynamicSta extends CustomStack{
    public DynamicSta() {
        super();//it will call CustomStack
    }
    public DynamicSta(int size) {
        super(size);//it will call CustomStack
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            //double the size
            int[] temp = new int[data.length *2];

            //copy all the previous items to new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know that array is no full
        //insert item
        return super.push(item);
    }

}
