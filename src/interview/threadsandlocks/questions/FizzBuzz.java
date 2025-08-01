package interview.threadsandlocks.questions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>(n);

        for(int i = 1; i < n; i++){
            //check if it divisible by 3
            if(i % 3 == 0 && i % 5 == 0){
                res.add("FizzBuzz");
            }

            else if( i % 3 == 0) {
                res.add("Fizz");
            }else if(i % 5 == 0){
                res.add("Buzz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.fizzBuzz(20));
    }

}
