class Solution {
    public boolean wordPattern(String pattern, String s) {
       String s1[]=s.split(" ");
       if(pattern.length()!=s1.length) return false;
       for(int i=0;i<s1.length-1;i++)
       {
        for(int j=i+1;j<s1.length;j++)
        {
            if(s1[i].equals(s1[j]))
            {
                if(pattern.charAt(i)!=pattern.charAt(j))
                {
                    return false;
                }
            }
            else 
            {
                if(pattern.charAt(i)==pattern.charAt(j)){
                    return false;
                }
            }
        }
           
       }
       return true;
    }
}