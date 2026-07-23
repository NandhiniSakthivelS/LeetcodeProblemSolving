class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
       for( int x=0;x<nums.length;x++)
       {
        if(nums[x]==target)
        {
            int dif=Math.abs(x-start);
            min=Math.min(min,dif);
        }
       } 
       return min;
    }
}