class Solution {
    public int[] shuffle(int[] nums, int n) {
        //List<Integer> list = new ArrayList<>();
        int ans[]=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++)
        {
              ans[index++]=nums[i];
              ans[index++]=nums[n+i];
        }
        //System.out.println(list);
        return ans;
    }
}