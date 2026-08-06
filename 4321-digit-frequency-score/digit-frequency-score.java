class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=0)
        {
            int rem =n%10;
            map.merge(rem,1,Integer::sum);
            n/=10;
        }
        
        int ans = 0;
        for(Map.Entry<Integer,Integer> item : map.entrySet())
        {
            ans =  ans + (item.getKey() * item.getValue());
        }
        return ans;
    }
}