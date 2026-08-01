class Solution {
    public int xorOperation(int n, int start) {
        int ans[]=new int[n];
        ans[0]=start;
        for(int i=1;i<n;i++)
        {
            ans[i]=ans[i-1]+2;
        }
        System.out.println(Arrays.toString(ans));
         int xor=0;
         for(int i=0;i<n;i++)
         {
            xor = xor ^ ans[i];
         }
        
        return xor;
    }
}