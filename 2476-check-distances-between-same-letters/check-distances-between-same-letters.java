class Solution {
    public boolean checkDistances(String s, int[] distance) {
        //StringBuilder sb = new StringBuilder(s);
       for(int i=0;i<distance.length;i++)
       {
         char ch = (char) (97 + i);
         System.out.println(ch);
         int l=s.indexOf(ch);
         int r=s.lastIndexOf(ch);
         if(s.indexOf(ch)==-1)continue;
         int dif=(r-l)-1;
         if(dif!=distance[i]) return false;
       }
       return true;
    }
}