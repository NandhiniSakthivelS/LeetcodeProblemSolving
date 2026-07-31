class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;long ans=0;int sub=n;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        int digit=0;
        while(sub!=0)
        {
            int rem=sub%10;
            if(rem!=0)
              digit=(digit*10)+rem;
            sub/=10;
        }
        long ans1=0;
        while(digit!=0)
        {
            int rem=digit%10;
            if(rem!=0)
              ans1=(ans1*10)+rem;
            digit/=10;
        }
       
        return ans1*sum;
    }
}