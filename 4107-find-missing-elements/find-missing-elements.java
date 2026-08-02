class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);int temp=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=temp)
            {
                list.add(temp);
                i--;
            }
            temp++;
        }
        return list;
    }
}