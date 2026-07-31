class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = Integer.MAX_VALUE,pos=0;
        for(int i=0;i<k;i++)
        {
            min=Arrays.stream(nums).min().getAsInt();
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==min)
                {
                    pos=j;
                    break;
                }
            }
            nums[pos]=min*multiplier;

        }
        return nums;
    }
}