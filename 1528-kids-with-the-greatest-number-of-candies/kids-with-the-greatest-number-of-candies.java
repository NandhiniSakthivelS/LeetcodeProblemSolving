class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int present=candies[i]+extra;
            int max =0;
            for(int j=0;j<candies.length;j++)
            {
                max=Math.max(max,candies[j]);
            }
            if(max<=present) list.add(true);
            else list.add(false);
        }
          return list;
    }
}