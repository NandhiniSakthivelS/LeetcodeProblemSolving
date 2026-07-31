class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String b=s.trim();
        String a[]=b.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i].isEmpty() || a[i].isBlank())
            {
                continue;
            }
            ans+=a[i];
            if(i!=0)
            {
            ans+=" ";
            }
        }
        return ans;
    }
}