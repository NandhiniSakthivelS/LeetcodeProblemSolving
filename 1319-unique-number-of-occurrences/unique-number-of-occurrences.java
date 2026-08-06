class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int x : arr)
        {
            map.merge(x,1,Integer ::  sum);
        } 
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : map.values())
        {
            if(list.contains(x)) return false;
            list.add(x);
        }
        return true;
    }
}