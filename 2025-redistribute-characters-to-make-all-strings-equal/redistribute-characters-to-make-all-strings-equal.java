class Solution {
    public boolean makeEqual(String[] words) {
        int freq[]=new int[26];
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                char ch = words[i].charAt(j);
                freq[ch-'a']++;
            }
        }
        Arrays.sort(freq);
        for(int i=freq.length-1;i>=0;i--)
        {
            if(freq[i]!=0 && freq[i]%words.length!=0) return false;
        }
        return true;
    }
}