class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int count=1;
        int temp=0;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else
            {
                l.add(count);
                count=1;
            }
        }
        l.add(count);
        Collections.sort(l);
        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i).equals(l.get(i+1))) return false;  
        }
        return true;
    }
}