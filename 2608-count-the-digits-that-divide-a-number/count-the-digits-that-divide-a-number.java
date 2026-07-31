class Solution {
    public int countDigits(int num) {
        int count=0;
        int filler=num;
        while(num!=0)
        {
            int mod=num % 10;
             if(filler % mod==0)
             {   
                count++;
             }
             num/=10;
        }
        return count;
    }
}