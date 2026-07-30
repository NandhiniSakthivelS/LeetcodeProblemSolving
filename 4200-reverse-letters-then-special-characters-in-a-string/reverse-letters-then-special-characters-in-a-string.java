class Solution {
    public String reverseByType(String s) {
        StringBuilder letter = new StringBuilder();
        StringBuilder special = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                letter.append(ch);
            }
            else
            {
                special.append(ch);
            }
        }
        StringBuilder let = letter.reverse();
         int pos= special.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!Character.isLetter(c))
            {
                char spec = special.charAt(pos--);
                let.insert(i,spec+"");
            }
        }
        
        return let.toString();
    }
}