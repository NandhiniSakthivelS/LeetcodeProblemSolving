class Solution {
    public int maxScore(int[] cardPoints, int k)
    {
        int l=k-1;
        int r=cardPoints.length;
        int lsum =0; int rsum=0;
        for(int i=0;i<=l;i++)
        {
            lsum = lsum+cardPoints[i];
        }
        int max = 0;
        while(l>=0)
        {
            max = Math.max(max, lsum+rsum);
            lsum = lsum - cardPoints[l];
            l--;
            r--;
            rsum = rsum + cardPoints[r];
        }
        max = Math.max(max, lsum+rsum);
        return max;
    }
}