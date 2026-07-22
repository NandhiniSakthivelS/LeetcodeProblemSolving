class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==-1)continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[i]=-1;nums[j]=-1;
                    count++;
                    break;
                }
            }
        }int rem=0;
        for(int x : nums)
        {
            if(x>=0)rem++;
        } 
        int ans[]=new int[2];
        ans[0]=count;ans[1]=rem;
        return ans;
    }
}