class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]<10) continue;
            int count=0;
            while(nums[i]!=0)
            {
                int rem=nums[i]%10;
                count+=rem;
                nums[i]/=10;
            }
            nums[i]=count;
        }
    
        return Arrays.stream(nums).min().getAsInt();
    }
}