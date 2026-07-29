class Solution {
    public int findFinalValue(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                target=nums[i]*2;
            }
        }
        return target;
    }
}