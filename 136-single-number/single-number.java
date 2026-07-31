class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==-1)
            {
                continue;
            }
               if(nums[i]==nums[i+1])
            {
                nums[i+1]=-1;
                
            }
            else
            {
                return nums[i];
            }
             
        }
        return nums[nums.length-1];
    }
}