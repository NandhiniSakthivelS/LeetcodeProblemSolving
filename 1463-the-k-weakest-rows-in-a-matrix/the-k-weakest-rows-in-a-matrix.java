class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[]=new int[mat.length];
        int pos=0;
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)count++;
            }
            ans[pos++]=count;
        }
        System.out.println(Arrays.toString(ans));
         
        int arr[]=new int[k];
        pos=0;
        int sub[]=ans.clone();
        Arrays.sort(sub);
        
        System.out.println(Arrays.toString(sub));
        
        for(int i=0;i<sub.length;i++)
        {
            int num=sub[i];
            for(int j=0;j<ans.length;j++)
            {
               if(num==ans[j])
               {
                   arr[pos++]=j;
                   ans[j]=-1;
               } 
               if(pos==k) return arr;
            }
        }
        return arr;
    }
}