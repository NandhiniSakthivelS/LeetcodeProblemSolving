class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int c=1;
        if(sb.length()<4)return sb.toString();
        for(int i=sb.length()-1;i>=0;i--)
        {
            if(c==3)
            {
                sb.insert(i,".");
                c=1;
            }
            else c++;
        }
        if(sb.charAt(0)=='.') return sb.deleteCharAt(0).toString();
        return sb.toString();

    }
}