class Solution {
    public boolean digitCount(String num) {
        if(num.length()==1)return false;

        char j='0';
        StringBuilder sb = new StringBuilder(num);
        while((j-'0')<num.length()-1)
        {
            int ch = num.charAt(j-'0')-'0';
            String regex = "[^" + j + "]";
            int count = num.replaceAll(regex, "").length();
            if(count!=ch) return false;
            j++;
        }
        
        return true;
    }
}