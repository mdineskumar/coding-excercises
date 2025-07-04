package core_java_udemy.variables;

public class IfLadder {
    public static void main(String[] args) {
        int x = 10;
        if(x >20){
            System.out.println("x greater than 20");
        } else if (x > 10) {
            System.out.println("x less than 20 and greater than 10");
        } else if (x > 5) {
            System.out.println("5< x < 10");
        }
        else{
            System.out.println("x < 5");
        }
    }
}
