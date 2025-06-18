package core_java_udemy.mostwanted;

public class IllegalArgumentDemo {
    public static int sum(int a, int b){
        if(a==0 || b == 0 ){
            throw new IllegalArgumentException("a and b should not be zero");
        }
        return a + b;
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        //thread.setPriority(12);

        sum(0,7);
    }
}
