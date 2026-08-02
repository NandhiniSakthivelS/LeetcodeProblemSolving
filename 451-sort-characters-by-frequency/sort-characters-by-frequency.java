class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
       // Arrays.sort(freq);
        StringBuilder ans = new StringBuilder();
        int maxPos=0;
        for(int i=0;i<freq.length;i++)
        {
            int maxVal=0;
            for (int j = 0; j < freq.length; j++) {
            if (freq[j] > maxVal) { 
                maxVal = freq[j]; // Update max value
                maxPos = j;      // Update its position
            }
           }
               char ch = (char) maxPos;
               System.out.println(ch);
               ans.append(String.valueOf(ch).repeat(freq[maxPos]));
               freq[maxPos]=0; 
            
        }
        return ans.toString();
    }
}