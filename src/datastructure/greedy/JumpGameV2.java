package datastructure.greedy;

public class JumpGameV2 {
    public int jump(int[] nums) {
        int destination = nums.length - 1;
        int totalJumps = 0;
        int coverage = 0;
        int n = nums.length;
        int lastJumpIdx = 0;

        if (n == 1) return 0;

        for (int i = 0; i < n; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if(i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;

                if(coverage >= destination) {
                    return totalJumps;
                }
            }

        }
        return totalJumps;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,1,2,3,1,1,2};
        JumpGameV2 jumpGameV2 = new JumpGameV2();

        System.out.println(jumpGameV2.jump(nums));


    }
}
