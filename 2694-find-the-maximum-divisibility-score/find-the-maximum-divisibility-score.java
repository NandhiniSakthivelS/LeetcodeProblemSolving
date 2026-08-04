class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int ans = Integer.MAX_VALUE;
        //int currentScore = 0;
        for (int d : divisors) {
            int currentScore = 0;
            for (int n : nums) {
                if (n % d == 0) {
                    currentScore++;
                }
            }
            
            if (currentScore > maxScore) {
                maxScore = currentScore;
                ans = d;
            } else if (currentScore == maxScore) {
                ans = Math.min(ans, d);
            }
        }
        return ans;
    }
}
