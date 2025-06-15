package delete;

public class Operators {
    public static void main(String[] args) {
        int x = 10;
        int preIncrement = ++x;
        System.out.println("Value of X: "+x);
        System.out.println("Pre Increment: "+preIncrement);

        int postIncrement = x++;
        System.out.println("Value of X: "+x);
        System.out.println("Post Increment: "+postIncrement);

        int preDecrement = --x;
        System.out.println("Value of X: "+x);
        System.out.println("Pre Decrement: "+preDecrement);

        int postDecrement = x--;
        System.out.println("Value of X: "+x);
        System.out.println("Post Decrement: "+postDecrement);

    }
}
