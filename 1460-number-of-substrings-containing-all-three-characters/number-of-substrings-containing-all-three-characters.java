class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int seen[]= {-1,-1,-1};
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            seen[ch-'a']=i;
            if(seen[0]!=-1 && seen[1]!=-1 && seen[2]!=-1)
            {
                int min = Math.min(seen[0],seen[1]);
                min = Math.min(min,seen[2]);
                ans= ans+ (1+min);
            }
        }
        return ans;
    }
}