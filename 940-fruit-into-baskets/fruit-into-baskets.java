class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int l=0;
        int r=0;
        while(r<arr.length)
        {
            map.merge(arr[r],1,Integer::sum);
            if(map.size()>2)
            {
                map.replace(arr[l],map.get(arr[l]),map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}