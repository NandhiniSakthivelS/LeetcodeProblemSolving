class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1) return arr[0];
        int percent = arr.length/4;
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])count++;
            else count=1;
            if(count>percent) return arr[i];
        }

        return percent;

    }
}