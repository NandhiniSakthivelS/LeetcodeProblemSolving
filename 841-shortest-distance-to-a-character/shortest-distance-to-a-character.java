class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==c) ans[i]=0;
            
            int left=-1;
            
            if(i!=0)
            {
             left=s.substring(0,i).lastIndexOf(c);
            }
            
            int right = s.substring(i,s.length()).indexOf(c);
            
            System.out.println(left+" "+right);
            if(left ==-1)
            {
                ans[i]=right;
            }
            else if(right==-1)
            {
                ans[i]=i-left;
            }
            else
            {
                int dif=i-left;
                if(dif<right) ans[i]=dif;
                else ans[i]=right;
            }
        }
        return ans;
    }
}