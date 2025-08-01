package leetcode.arrays;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockTwo {
    public int maxProfit(int[] prices) {
        System.out.println(Arrays.toString(prices));
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                //prices increase
                //good to sell
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockTwo b = new BestTimeToBuyAndSellStockTwo();
        System.out.println(b.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(b.maxProfit(new int[] {1,2,3,4,5}));
        System.out.println(b.maxProfit(new int[] {7,6,4,3,1}));
    }
}
