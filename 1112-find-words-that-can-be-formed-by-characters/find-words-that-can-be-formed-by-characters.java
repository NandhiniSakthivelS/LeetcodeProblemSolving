class Solution {
    public int countCharacters(String[] words, String c) {
        
     int ans=0;
     
     for(int i=0;i<words.length;i++)
     {
        int count=0;
        String s=words[i];//cat
        StringBuilder sb = new StringBuilder(c);
        for(int j=0;j<s.length();j++)
        {
            char ch = s.charAt(j);
            if(sb.indexOf(ch+"")!=-1) 
            {
                sb.deleteCharAt(sb.indexOf(ch+""));
                count++; 
            }
        }
        if(count==s.length()) ans+=s.length();
     }
      return ans;
    }
}