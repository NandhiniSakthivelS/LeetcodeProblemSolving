class Solution {
    public String convertToTitle(int n) {
        String result="";
        while(n>0)
        {
           n=n-1; 
           int num = n%26;
           char ch = (char) ('A'+num);
           result = ch+"" +result;
           n/=26;
        }
        return result;
    }
}