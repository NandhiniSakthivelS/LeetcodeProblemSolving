class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max=0;
        int num=nums[0];int count=0;     // 1 2 6 7 8
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==num-1)continue;

            if(nums[i]==num++) count++;
            else 
            {
                max=Math.max(count,max);
                num=nums[i];
                count=0;
                i=i-1;
            }
        }
        max=Math.max(max,count);
        return max;
}
}