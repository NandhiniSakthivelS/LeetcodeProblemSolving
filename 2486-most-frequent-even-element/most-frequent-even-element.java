class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int count=0; 
        int max=0;
        int ele=-1;    // 2,2,1000,1000,1000
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){ count=1;
            
           for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]) count++;
                
                else
                {
                    if(max<count)
                    {
                        max=count;
                        ele=nums[i];
                    }
                    i=j-1;
                    break;
                }

                if(j==nums.length-1)
                {
                    if(max<count) return nums[nums.length-1];
                }
            }}
            else continue;
            
        }
        if(max<count) return nums[nums.length-1];
        return ele;
    }
}