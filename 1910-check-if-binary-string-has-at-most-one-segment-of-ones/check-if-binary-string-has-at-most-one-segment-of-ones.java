class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1 && s.charAt(0)=='1') return true;
        if(s.contains("01")) return false;
        return true;
    }
}