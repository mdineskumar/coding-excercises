package core_java_udemy;

public class LabelledBlock {
    public static void main(String[] args) {
        int x = 10;

        l1:{
            System.out.println("Block begins");
            if(x==20){
                break l1;
            }
            System.out.println("Block ends");
        }
        System.out.println("Outside the block");


    }
}
