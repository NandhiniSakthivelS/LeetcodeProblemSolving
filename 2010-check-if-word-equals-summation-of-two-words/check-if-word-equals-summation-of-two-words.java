class Solution {
    public boolean isSumEqual(String firstWord, String lastWord, String targetWord) {
        int f1=function(firstWord);
        int f2=function(lastWord);
        int fin = function(targetWord);
        if(f1+f2==fin)return true;
        return false;
    }
    public static int function(String s)
    {
       String n1="";
       for(int i=0;i<s.length();i++)
       {
         int num= s.charAt(i)-'a';
         System.out.print(num+" ");
         n1+=num+"";
       }
        
        return Integer.parseInt(n1);
    }
    
}