class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder(s);
        String sub = "";
        for(int i=0;i<words.length;i++)
        {
            if(sb.isEmpty()) break;
            if(!sb.toString().startsWith(words[i])) return false;
            if(sb.toString().startsWith(words[i]))
            {
                sb.delete(0,words[i].length());
            }
        }
        if(sb.isEmpty()) return true;
        return false;
    }
}