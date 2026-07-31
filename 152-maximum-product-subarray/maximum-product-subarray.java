class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int mul=1;
            for(int j=i;j<nums.length;j++)
            {
                mul*=nums[j];
                max=Math.max(max,mul);
            }
        }
        return max;
    }
}