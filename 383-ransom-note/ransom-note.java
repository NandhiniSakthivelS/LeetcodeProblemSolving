class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char a[]=new char[26];
        char b[]=new char[26];
        for(int i=0;i<ransomNote.length();i++)
        {
            char c1 = ransomNote.charAt(i);
            a[c1-'a']++;
        }
        for(int i=0;i<magazine.length();i++)
        {
            char c2 = magazine.charAt(i);
            b[c2-'a']++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>b[i])
            {
                return false;
            }
        }
        return true;
    }
}