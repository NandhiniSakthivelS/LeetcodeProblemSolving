class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans=1;
        while(n!=0)
        {
            int rem=n%10;
            list.add(rem);
            n/=10;
        }
        Collections.sort(list);
        ans=list.get(list.size()-1)*list.get(list.size()-2);
        return ans;
    }
}