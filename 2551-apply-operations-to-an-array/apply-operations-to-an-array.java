class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        /*int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            if(nums[start]==0 && nums[end]!=0)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            if(nums[start]!=0) start++;
            if(nums[end]==0)end--;
        }*/
         int ans[]=new int[nums.length];
         int count=0;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]!=0)
            {
                ans[count++]=nums[i];
            }
         }
        return ans;
    }
}