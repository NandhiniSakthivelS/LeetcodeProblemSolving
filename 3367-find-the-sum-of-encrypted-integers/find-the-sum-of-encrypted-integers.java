class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int x : nums)
        {
            int max=Integer.MIN_VALUE;
            if(x<10) sum+=x;
            
            else
            {
                int count=0;
                while(x!=0)
                {
                    int rem=x%10;
                    max=Math.max(max,rem);
                    x/=10;
                    count++;
                }
                String result = String.valueOf(max).repeat(count);
                sum+=Integer.valueOf(result);
            }
        }
        return sum;
        
    }
}