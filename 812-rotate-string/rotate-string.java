class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder a=new StringBuilder(s);
        int count=0;
        while(count<s.length())
        {
           a.append(a.charAt(0));
           a.deleteCharAt(0);
           if(a.toString().equals(goal))
           {
            return true;
           }
           count++;
        }
        return false;
    }
}