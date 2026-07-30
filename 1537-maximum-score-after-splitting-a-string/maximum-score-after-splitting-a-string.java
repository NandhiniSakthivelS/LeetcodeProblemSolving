class Solution {
    public int maxScore(String s) {
        
        int max=0;
        for(int i=1;i<s.length();i++)
        {
            int zerocount=0,onecount=0;
            String sub=s.substring(0,i);
            String subb=s.substring(i,s.length());
            for(int j=0;j<sub.length();j++)
            {
                  if(sub.charAt(j)=='0') zerocount++;
            }
            for(int k=0;k<subb.length();k++)
            {
                 if(subb.charAt(k)=='1')onecount++;
            }
            int sum=zerocount+onecount;
            max=Math.max(max,sum);

        }
        return max;
    }
}