class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
         int max=0; int count=0;int ans=0;
         for(int i=0;i<nums.length-1;i++)
         {
            count=0;
            int dif=nums[i]-nums[i+1];
            for(int j=i;j<nums.length-1;j++)
            {
                   if(nums[j]-nums[j+1]!=dif)break;
                   if(nums[j]-nums[j+1]==dif)count++;
                   if(count>=2)
                   {
                    ans++;
                   }   
            }
            System.out.println(ans+" ");
         }
           if(count>2) ans++;
           return ans;
    }
}