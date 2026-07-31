class Solution {
    public int largestAltitude(int[] gain) {
       int[] a=new int[gain.length+1];
       int index=0;
       for(int i=1;i<a.length;i++)
       {
          a[i]=a[i-1]+gain[index++];
       }
       return Arrays.stream(a).max().getAsInt();
    }
}