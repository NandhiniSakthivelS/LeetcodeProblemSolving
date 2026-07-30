class Solution {
    public boolean halvesAreAlike(String s) {
        String vow="aeiouAEIOU";
        int count=0;
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        System.out.print(s1+" "+s2);
        for(int i=0;i<s.length()/2;i++)
        {
            if(vow.indexOf(s1.charAt(i))!=-1) count++;
            if(vow.indexOf(s2.charAt(i))!=-1)count--;
        }
        return count==0;
    }
}