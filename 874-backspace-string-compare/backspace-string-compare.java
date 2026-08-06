class Solution {
    public boolean backspaceCompare(String s, String t) {
        int c1=0;int c2=0; int special =0;
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        for(int i=0;i<sb1.length();i++)
        {
            char ch = sb1.charAt(i);
            if(!Character.isLetter(ch) && i!=0)
            {
                sb1.deleteCharAt(i);
                sb1.deleteCharAt(i-1);
                //sb1.deleteCharAt(i-1);
                i=i-2;
            }
             else if(!Character.isLetter(ch) && i==0)
             {
                sb1.deleteCharAt(i);
                i--;
             }
        }
        for(int i=0;i<sb2.length();i++)
        {
            char ch = sb2.charAt(i);
            if(!Character.isLetter(ch) && i!=0)
            {
                sb2.deleteCharAt(i);
                sb2.deleteCharAt(i-1);
                //sb2.deleteCharAt(i-1);
                i=i-2;
                System.out.println(sb2.toString());
            } 
             else if(!Character.isLetter(ch) && i==0)
             {
                sb2.deleteCharAt(i);
                i--;
             }
        }
        System.out.println(sb1.toString()+" "+sb2.toString());
        return sb1.toString().equals(sb2.toString());
    }
}