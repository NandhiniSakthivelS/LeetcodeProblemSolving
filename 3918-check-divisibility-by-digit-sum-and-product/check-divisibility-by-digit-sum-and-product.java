class Solution {
    public boolean checkDivisibility(int n) 
    {
        int div=0; int prod =1;int sum=0;
        int num =n;
        while(num!=0)
        {
            int rem = num%10;
            prod *=rem;
            div+=rem;
            num/=10;
        }
        if(n%(div+prod)==0) return true;
        return false;
        
    }
}