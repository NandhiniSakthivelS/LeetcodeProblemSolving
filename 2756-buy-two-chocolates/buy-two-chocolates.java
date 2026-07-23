class Solution {
    public int buyChoco(int[] prices, int mon) {
        int count=1;
        int money=mon;
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++)
        {
            if(count==3) return mon;
            if(mon>=prices[i] && mon>0)
            {
                mon=mon-prices[i];
                count++;
            }
        }
        if(count!=3)return money;
        return mon;
    }
}