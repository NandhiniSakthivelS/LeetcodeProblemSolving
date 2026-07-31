class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<4) return false;
        int point=0;
        int count=0;
        int temp=nums[0]-1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1] && nums[i]!=temp)
            {
                count++;
                temp=nums[i];
            }
            else
            {
                if(count==0) return false;
                count=0;
                point=i;
                break;
            }
        }
        if(point==0) return false;
        for(int i=point;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1] && nums[i]!=temp)
            {
                count++;
                temp=nums[i];
            }
            else
            {
                if(count==0)return false;
                count=0;
                point=i;
                break;
            }
        }
        for(int i=point;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1] && nums[i]!=temp)
            {
                count++;
                temp=nums[i];
            }
            else
            {
                if(count==0)return false;
                return false;
            }
        }
        return true;
    }
}