package datastructure.arrays.leet_code;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int buying_price = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(buying_price > prices[i]){
                buying_price = prices[i];
            }else{
                int current_profit = prices[i] - buying_price;
                if(max_profit < current_profit){
                    max_profit = current_profit;
                }
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices1 = new int[]{7,1,5,3,6,4};
        int[] prices2 = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}
