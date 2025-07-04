package core_java_udemy.arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] c = {'a','z','q','p','o'};

        if( c[0] == c[c.length - 1]){
            System.out.println("first and last char same.");
        }else{
            System.out.println("They are different.");
        }

    }
}
