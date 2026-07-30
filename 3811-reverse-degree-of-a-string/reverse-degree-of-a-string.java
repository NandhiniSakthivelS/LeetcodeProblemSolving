class Solution {
    public int reverseDegree(String s) {
        int sum=0; int mul=1;
       for(int i=0;i<s.length();i++)
       {
          char ch = s.charAt(i);
          int alpha =  (int)'z'-ch;
          mul = (i+1) * (alpha+1);
          System.out.println(mul);
          sum+=mul;
       } 
       return sum;
    }
}