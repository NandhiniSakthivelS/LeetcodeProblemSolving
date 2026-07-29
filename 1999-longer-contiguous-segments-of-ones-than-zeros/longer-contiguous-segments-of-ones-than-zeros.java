class Solution {
    public boolean checkZeroOnes(String s) {
        int count=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1') count++;
            else
            {
                max1=Math.max(max1,count);
                count=0;
            }
        }
        max1=Math.max(max1,count);
         count=0;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0') count++;
            else
            {
                max2=Math.max(max2,count);
                count=0;
            }
        }
        max2=Math.max(max2,count);
       
        return max1>max2;
    }
}