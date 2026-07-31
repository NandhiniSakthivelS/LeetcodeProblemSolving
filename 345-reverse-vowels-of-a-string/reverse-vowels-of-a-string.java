class Solution {
    public String reverseVowels(String s) {
        String vow="aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int start=0,end=sb.length()-1;
        while(start<=end)
        {
           char ch1=sb.charAt(start);
           char ch2=sb.charAt(end);
           if(vow.indexOf(ch1)==-1)
           {
            start++;
           }
           else if(vow.indexOf(ch2)==-1)
           {
            end--;
           }
           else
           {
                sb.setCharAt(start,ch2);
                sb.setCharAt(end,ch1);
                start++;
                end--;
           }
        }
        return sb.toString();
    }
}