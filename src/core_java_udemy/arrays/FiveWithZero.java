package core_java_udemy.arrays;

public class FiveWithZero {
    public static void main(String[] args) {
        int[] a = {3,4,6,3,5,7};
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 3) {
                System.out.println("Element is 3: "+ i);
                //if next element is five
                if(a[i + 1] == 5) {
                    a[i + 1] = 0;
                }
            }
        }
        for (int element :
                a) {
            System.out.print(element);
        }
    }
}
