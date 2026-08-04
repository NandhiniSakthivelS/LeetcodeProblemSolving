class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        Arrays.sort(divisors);
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int x : divisors)
        {
            int count=0;
            for(int y : nums)
            {
                if(y%x==0)count++;
            }
            if(max<count)
            {
                max=count;
                ans=x;
            }
        }
        return ans;
    }
}