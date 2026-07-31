class Solution {
    public double angleClock(int hour, int minutes) {
        int min = minutes * 6;
        double hr = (hour * 30) + minutes * 0.5;
        double ans = Math.abs(min-hr);
        return Math.min(ans,360-ans);
    }
}