class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]) count++;
            else 
            {
                if(count==1)continue;
                if(count==2) return true;
                else if(count>2)
                    for(int j=2;j<count;j++)
                    {
                        if(count%j==0)
                        {
                            count=1;
                            break;
                        }
                    } 
                    if(count==1) continue;
                    else return true;  
            }
        }
                    for(int j=2;j<count;j++)
                    {
                        if(count%j==0)
                        {
                            return false;
                        }
                    } 
                    if(count==1) return false;
                    return true;
                    
        
    }
}