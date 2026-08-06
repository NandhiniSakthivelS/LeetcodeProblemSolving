class Solution {
    public int smallestNumber(int n, int t) {
        int limit = Integer.MAX_VALUE;
        for(int i=n;i<=limit;i++)
        {
            int num=i; int prod = 1;
            while(num!=0)
            {
               int rem = num%10;
               prod= prod*rem;
               num/=10;
            }
            if(prod%t==0) return i;
        }
        return 0;
    }
}