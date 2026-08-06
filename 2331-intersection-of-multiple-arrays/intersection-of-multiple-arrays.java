class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                map.merge(nums[i][j],1,Integer::sum);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> item : map.entrySet())
        {
            if(item.getValue()>=nums.length) list.add(item.getKey());
        }
        Collections.sort(list);
        return list;
    }
}