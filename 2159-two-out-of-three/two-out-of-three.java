class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]) list.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums3.length;j++)
            {
                if(nums2[i]==nums3[j]) list.add(nums2[i]);
            }
        }

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums3.length;j++)
            {
                if(nums1[i]==nums3[j]) list.add(nums1[i]);
            }
        }
        Collections.sort(list);
        //System.out.println(list);
        int temp=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=temp)
            {
                temp=list.get(i);
            }
            else 
            {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}