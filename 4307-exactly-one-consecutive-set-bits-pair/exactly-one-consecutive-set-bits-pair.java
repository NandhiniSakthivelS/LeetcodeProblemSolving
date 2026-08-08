class Solution {
    public boolean consecutiveSetBits(int n) {
        
        int m = n & (n >> 1);
        return m > 0 && (m & (m - 1)) == 0;
    }
}

 