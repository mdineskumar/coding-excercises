package core_java_udemy;

public class DoWhile {
    public static void main(String[] args) {
        int x = 1;
        do{
            if(x % 2 == 0){
                System.out.println(x);
            }
            x++;
        }while (x <= 30);
        //unreacheable code
        System.out.println("after do while");
    }
}
