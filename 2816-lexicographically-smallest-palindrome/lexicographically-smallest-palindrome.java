class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
           String s1 = s.charAt(start)+"";
           String s2=s.charAt(end)+"";         
           System.out.println(s1+" "+s2);
           int ans = s1.compareTo(s2);
           if(ans==0)
           {
             start++;
             end--;
              continue;
           } 
           else if(ans>0)
           {
            sb.setCharAt(start,sb.charAt(end));
           }
           else 
           {
            sb.setCharAt(end,sb.charAt(start));
           }
           start++;
           end--;
        }
        return sb.toString();
    }
}