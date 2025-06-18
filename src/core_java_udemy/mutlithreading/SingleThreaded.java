package core_java_udemy.mutlithreading;

public class SingleThreaded {
    public static void main(String[] args) {
        SingleThreaded singleThreaded = new SingleThreaded();
        singleThreaded.printNumbers();
        for (int j = 0; j <= 200; j++) {
            System.out.print("j: "+j+"\t");
        }
    }

    void printNumbers(){
        for (int i = 1; i <= 200; i++) {
            System.out.print("i: "+i+"\t");

        }
    }
}
