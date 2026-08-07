class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans[]=new int[2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list); 
        int i=1;
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int x : list)
        {
            map.merge(x,1,Integer::sum);
        }
        int pos=0;
        int missing =0;
        System.out.println(map);
        for(Map.Entry<Integer,Integer> item : map.entrySet())
        {
            if(pos==2) return ans;
            if(item.getValue()!=1)
            {
                ans[0]=item.getKey();
                
                if(item.getKey()!=i)
                {
                    if(ans[1]==0)
                    {
                        ans[1]=i;
                    }
                }
                else i++;
            }
            else if(item.getKey()!=i)
            {
                ans[1]=i;
                i=item.getKey()+1;
            }
            else i++;
        }
        if(ans[1]==0) ans[1]=i;
        return ans;
    }
}