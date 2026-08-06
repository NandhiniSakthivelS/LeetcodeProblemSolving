class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer , Integer> map = new LinkedHashMap<>();
        for(int x : nums)
        {
            map.merge(x,1,Integer::sum);
        }
        int count=0;
        for(Map.Entry<Integer , Integer> item : map.entrySet())
        {
            if(item.getValue()<k)
            {
                count+=item.getValue();
            }
            else count+=k;
        }
        int ans[]=new int[count];
        int temp=nums[0]-1;
        int pos=0;
        count=0;
    
        for(Map.Entry<Integer,Integer> item : map.entrySet())
        {
            if(item.getKey()!=temp)
            {
                temp=item.getKey();
                int time = item.getValue();
                if(time<k)
                {
                    for(int i=0;i<time;i++)
                    {
                        ans[pos++]=item.getKey();
                    }
                }
                else
                {
                    for(int i=0;i<k;i++)
                    {
                        ans[pos++]=item.getKey();
                    }
                }
            }
        }
        return ans;
    }
}