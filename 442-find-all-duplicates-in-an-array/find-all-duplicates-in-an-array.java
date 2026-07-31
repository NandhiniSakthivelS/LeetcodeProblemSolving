class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        int temp=nums[0]-1;
        for( int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1] && nums[i]!=temp)
            {
                li.add(nums[i]);
                temp = nums[i];
            }
        }
        return li;
    }
}