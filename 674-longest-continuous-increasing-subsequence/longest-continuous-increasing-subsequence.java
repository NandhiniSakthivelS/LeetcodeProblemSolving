class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
             if(nums[i]<nums[i+1]) count++;//3
             else
             {
                   max=Math.max(max,count);//3
                   count=1;
             }
        }
        max=Math.max(max,count);
        return max;
    }
}