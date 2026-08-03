class Solution {
    public int longestPalindrome(String s) {
        
        int freq[]=new int[256];
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        Arrays.sort(freq);
        System.out.println(Arrays.toString(freq));
        for(int i=freq.length-1;i>=0;i--)
        {
            if(freq[i]==0)break;
            if(freq[i]%2==0)
            {
                count+=freq[i];
                freq[i]=0;
            } 
        }
        System.out.println(count); boolean flag=false;
        for(int i=freq.length-1;i>=0;i--)
        {
            if(freq[i]%2!=0)
            {
               flag=true;
                count = count + (freq[i]-1);
                 freq[i]=1;
            }
        }

        if(flag) count++;
        return count;
    }
}