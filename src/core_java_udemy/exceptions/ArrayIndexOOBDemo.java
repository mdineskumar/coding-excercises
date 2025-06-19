package core_java_udemy.exceptions;

public class ArrayIndexOOBDemo {
    public static void main(String[] args) {

        int[] arr = new int[]{20,30,50};
        try{
            System.out.println("elements of arrays");

            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);

            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index beyond array length");
        }

        //never excuted after exception
        System.out.println("after array output");
    }

    void method1(){
        System.out.println("method1");
    }
}
