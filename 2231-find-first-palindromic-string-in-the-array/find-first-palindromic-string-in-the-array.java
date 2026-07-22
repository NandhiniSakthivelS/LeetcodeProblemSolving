class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            StringBuilder rev=new StringBuilder(words[i]);
            if(sb.toString().equals(rev.reverse().toString()))  return sb.toString();

        }
        return "";
    }
}