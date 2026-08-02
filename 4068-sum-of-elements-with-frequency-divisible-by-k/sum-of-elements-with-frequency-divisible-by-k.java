class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int ans=0;int temp=nums[0];
        for(int i=0;i<nums.length;i++)
        {
           if(temp==nums[i])
           {
                count++;
                temp=nums[i];
           }
           else
           {
              if(count%k==0)
              {
                ans = ans + (temp*count);
              }
              count=1;
              temp=nums[i];
           }
        }
        if(count%k==0)
              {
                ans = ans + (temp*count);
              }
        return ans;
    }
}