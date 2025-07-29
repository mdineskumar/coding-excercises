package leetcode.bit_manipulation;

public class NumberofOneBits {
    public int hammingWeight(int n){
        int a = n;
        int res = 0;
        while(a > 0 ){
            if( (a & 1) == 1){
                res++;

            }
            a >>=  1;

        }
        return res;
    }

    public static void main(String[] args) {
        NumberofOneBits nob = new NumberofOneBits();
        System.out.println(nob.hammingWeight(11));
        System.out.println(nob.hammingWeight(128));
        System.out.println(nob.hammingWeight(2147483645));
    }
}
