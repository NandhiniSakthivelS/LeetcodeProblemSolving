class Solution {
    public boolean checkRecord(String s) {
        int countA=0,countL=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='A')
           {
            countA++;
           }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                countL++;
            }
            else
            {
                if(countL>=3 || countA>=2)
                {
                    return false;
                }
                else
                {
                    countL=0;
                }
            }
        }
        if(countL>=3)
        {
            return false;
        }
        return true;
    }
}