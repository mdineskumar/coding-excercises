package core_java_udemy.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50};
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = new Integer(20); //auto boxing
//        arr[3] = 30.54;
        arr[3] = 40;

        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i+ "] = "+ arr[i]);
        }
        //arr[8] = 495;

        //for each java 1.5
        //arrays and collections
        for( int element : arr){
            System.out.println(element);
        }

        long[] arr1 = new long[4];
        for (long element : arr1) {
            System.out.println(element);
        }

    }
}
