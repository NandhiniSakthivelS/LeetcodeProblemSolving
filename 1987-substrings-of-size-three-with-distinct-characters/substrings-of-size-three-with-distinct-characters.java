class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            String sub=""; //xyz
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(sub.indexOf(ch)==-1) sub+=ch;
                else 
                {
                    break;
                }
                if(sub.length()==3)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}