class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ele=1;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele) ele++;
            else 
            {
                ele++;
                i--;
                count++;
            }

            if(count==k) return ele-1;
        }
        System.out.println(count);
        return arr[arr.length-1]+(k-count);
    }
}