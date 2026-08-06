class Solution {
    public int minimumSwaps(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int count=0;
        while(start<=end)
        {
            if(nums[start]==0 && nums[end]!=0)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                count++;
                start++;
                end--;
            }
            if(nums[start]!=0) start++;
            if(nums[end]==0) end--;
        }
        return count;
    }
}