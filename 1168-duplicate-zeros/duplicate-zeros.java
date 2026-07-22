class Solution {
    public void duplicateZeros(int[] arr) {
        int ans[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count > ans.length)break;
            else if (arr[i]!=0 && count<ans.length) ans[count++]=arr[i];
            else if(arr[i]==0)
            {
                if(count<ans.length) ans[count++]=0;
                if(count<ans.length) ans[count++]=0;
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            arr[i]=ans[i];
        }
        
    }
}