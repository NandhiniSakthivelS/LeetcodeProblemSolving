class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int mul = 1;int count=0;
        for(int x : nums)
        {
            if(x!=0) mul = mul * x;
            else count++;
        }
        if(count>1) return ans;
        for(int i=0;i<nums.length;i++)
        {
            if(count==1)
            {
                if(nums[i]==0) ans[i]=mul;
            }
            else if (count==0)
            {
                ans[i]=mul/nums[i];
            }
        }
        return ans;
    }
}
