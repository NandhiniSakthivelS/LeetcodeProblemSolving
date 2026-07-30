class Solution {
    public String replaceDigits(String s) {
        String sb = new String();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                sb+=ch; // sb = a
            }
            else if (Character.isDigit(ch))
            {
                if(ch=='0') sb+=sb.charAt(sb.length()-1); // sb =aa
                
                else
                {
                    int num=ch-'0';
                    char subChar = (char)(sb.charAt(sb.length()-1) + num);
                    sb+=subChar;
                }
            }
            System.out.print(sb+ " ");
           
        }
         return sb;
    }
}