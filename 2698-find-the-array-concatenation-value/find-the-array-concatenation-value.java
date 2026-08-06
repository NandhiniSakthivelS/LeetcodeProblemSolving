class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int start =0;
        int end=nums.length-1;
        long concat=0;
        long ans=0;
        while(start<end)
        {
            String s = (nums[start]+"")+(nums[end]+"");
            concat =Long.valueOf(s);
            ans+=concat;
            start++;
            end--;
        }
        if(nums.length%2!=0) 
        {
            ans+=nums[nums.length/2];
        }
        return ans;
    }
}