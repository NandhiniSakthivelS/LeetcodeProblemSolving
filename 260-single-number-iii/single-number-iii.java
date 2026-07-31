class Solution {
    public int[] singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int arr[]={-1,-1};
        arr[1]=nums[nums.length-1];
        int j=0;
        for(int i=0;i<nums.length-1;i++)//0122
        {
           
           if(nums[i]==-1) continue;
            if(nums[i]!=nums[i+1])
            {
                arr[j++]=nums[i];
            }
            else
            {
                nums[i+1]=-1;
            }
        }
        return arr;
    }
}