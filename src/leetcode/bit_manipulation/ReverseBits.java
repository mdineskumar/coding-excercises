package leetcode.bit_manipulation;

public class ReverseBits {

    // how to create binary numbers in java
    //no need to create binary numbers
    // just use bitwise operator like
    // AND - &
    // OR - |
    // NOT - ~
    //XOR - ^
    //LEft shift  << , adding bits
    //right shift >> - remove bits

    public int reverseBits(int n) {
        int reverse = 0;
        int sign = 32;
        while(sign > 0) {

            //get remove last bit from n and add to reverse
            int last_bit = n & 1;//get last bit: 0 or 1
            System.out.print(last_bit);
            int addBittoLast = reverse << 1; // shift bit to left 0 -> 00
            reverse = addBittoLast | last_bit; //it sets last
            n = n >> 1; //remove last bit
            sign--;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseBits rb = new ReverseBits();
        System.out.println("\n"+rb.reverseBits(43261596));
    }
}
