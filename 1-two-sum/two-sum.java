class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int dif = target-nums[i];
            if(!map.containsKey(dif))
            {
                map.put(nums[i],i);
            }
            else
            {
                ans[0]=i;
                ans[1]=map.get(dif);
                break;
            }
        }
        return ans;
    }
}