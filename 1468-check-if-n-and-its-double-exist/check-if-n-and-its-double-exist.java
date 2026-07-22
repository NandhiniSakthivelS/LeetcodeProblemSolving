class Solution {
    public boolean checkIfExist(int[] arr) {
      
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i]*2;
        
                for(int j=0;j<arr.length;j++)
                {
                    if(j==i)continue;
                    if(arr[j]==num)
                    {
                        return true;
                    }
                }
            
        }
        return false;
    }
}