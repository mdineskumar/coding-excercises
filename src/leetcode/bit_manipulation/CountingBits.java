package leetcode.bit_manipulation;

import java.util.Arrays;

public class CountingBits {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i = 1; i < n+1;i++){
            int count = 0;
            int a = i;
            while(a > 0){
                if((a & 1) == 1){
                    count++;
                }
                //right shift current number
                a >>= 1;
            }

            res[i] = count;

        }

        return res;

    }


    public static void main(String[] args) {
        CountingBits cb = new CountingBits();
        System.out.println(Arrays.toString(cb.countBits(5)));
    }
}
