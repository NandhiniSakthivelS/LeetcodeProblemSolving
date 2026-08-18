class Solution {
    public boolean checkString(String s) {
        if(s.indexOf('a')==-1 || s.indexOf('b')==-1) return true;
        else if(s.lastIndexOf('a')<s.indexOf('b')) return true;
        return false;
    }
}