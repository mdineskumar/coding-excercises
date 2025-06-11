package core_java_udemy;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 40;
        final int b = 20;
        switch (a){
            case 10:
                System.out.println("case 10");
                break;
            case b:
                System.out.println("case 20");
                break;
            case 30:
                System.out.println("case 30");
                break;
            default:
                System.out.println("No matches");
        }
    }
}
