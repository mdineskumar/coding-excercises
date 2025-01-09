package datastructure.twopointers_slidingwindow;

class Solution {
    public int maxScore(int[] cardPoints, int k) {


        int maxSum = 0;
        int lsum = 0;
        int rsum = 0;

        for(int j = 0; j < k; j++){
            lsum = lsum + cardPoints[j];
            maxSum = lsum;
        }
        int rightIndex = cardPoints.length - 1;
        for (int i = k-1; i >= 0; i--) {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(lsum+rsum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxScore(new int[]{96,90,41,82,39,74,64,50,30}, 8));
    }
}