class Solution {
    public String[] findRelativeRanks(int[] score) {
       
        int n=score.length;
        int rank[]=score.clone();
        Arrays.sort(rank);  
        int z[]=new int[n];
        int count=1;
        for(int i=n-1;i>=0;i--)
        {
           for(int j=0;i<n;j++)
           {
              if(score[j]==rank[i])
              {
               z[j]=count++;
               break;
              }
           }
        }
        String ans[]=new String[n];
        for(int i=0;i<n;i++)
        {
            if(z[i]==1) ans[i]="Gold Medal";
            else if(z[i]==2) ans[i]="Silver Medal";
            else if(z[i]==3) ans[i]="Bronze Medal";
            else
            {
                ans[i]=String.valueOf(z[i]);
            }
        }
        System.out.print(Arrays.toString(z));
        return ans;
    }
}