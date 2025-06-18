package core_java_udemy.mostwanted;

public class ArrayIndexOutofBoundDemo {
    public static void main(String[] args) {
        int a[] = new int[20];
        System.out.println(a[0]);
        System.out.println(a[20]);
        System.out.println(a[a.length - 1]);
    }
}
