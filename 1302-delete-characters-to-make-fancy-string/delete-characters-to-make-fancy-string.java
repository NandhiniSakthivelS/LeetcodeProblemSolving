class Solution {
    public String makeFancyString(String s) {
        
        char f=s.charAt(0);
        StringBuilder sb = new StringBuilder(f+"");
        for(int i=1;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            if(s.charAt(i-1)==ch && ch==s.charAt(i+1) )
            {
                continue;
            }
            else
            {
                sb.append(ch);
            }
        }
        if(s.length()>=2) sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}