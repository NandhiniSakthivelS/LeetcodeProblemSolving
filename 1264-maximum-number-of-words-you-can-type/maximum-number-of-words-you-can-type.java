class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String s[]=text.split(" ");
        int count=s.length;
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<brokenLetters.length();j++)
            {
                char ch = brokenLetters.charAt(j);
                if(s[i].indexOf(ch)!=-1)
                {
                count--;
                break;
                }
            }
        }
        return count;
    }
}