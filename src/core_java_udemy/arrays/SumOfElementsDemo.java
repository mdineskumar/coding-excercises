package core_java_udemy.arrays;

public class SumOfElementsDemo {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int element :
                arr) {
            sum+= element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,5,3,5,5};
        System.out.println(sum(arr));
    }
}
