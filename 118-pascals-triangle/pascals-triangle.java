class Solution {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> ans = new ArrayList<>();
        int num=2;
        for(int i=0;i<row;i++)
        {
            List<Integer> ds = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
               if(i<=1 || j==0 || j==i) ds.add(1);
               else 
               {
                 int leftValue = ans.get(i - 1).get(j - 1);
                 int rightValue = ans.get(i - 1).get(j);
                 ds.add(leftValue + rightValue);
               }
            }
            ans.add(new ArrayList<>(ds));
            
        }
        return ans;
    }
}