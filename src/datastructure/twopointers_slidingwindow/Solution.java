package datastructure.twopointers_slidingwindow;

class Solution {
    public int maxScore(int[] cardPoints, int k) {


        int maxSum = 0;
        int lsum = 0;
        int rsum = 0;

        for(int j = 0; j < k; j++){
            int ele = cardPoints[j];
            lsum = lsum + cardPoints[j];
            maxSum = lsum;
        }
        for (int i = 1; i <= k; i++) {
            int leftIndex = k - i;
            lsum = lsum - cardPoints[leftIndex];
            int rightIndex = cardPoints.length - i;
            rsum = rsum + cardPoints[rightIndex];
            maxSum = Math.max(lsum+rsum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxScore(new int[]{96,90,41,82,39,74,64,50,30}, 8));
    }
}