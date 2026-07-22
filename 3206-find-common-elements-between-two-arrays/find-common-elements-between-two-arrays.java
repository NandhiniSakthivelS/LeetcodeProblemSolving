class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n1[]=nums1.clone();
        int n2[]=nums2.clone();
        int ans[]={0,0};int fc=0,sc=0;
        for(int i=0;i<nums1.length;i++)
        {
            int num=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(num==nums2[j])
                {
                    fc++;
                    nums2[j]=-1;
                }
            }
        }
        for(int i=0;i<n2.length;i++)
        {
            int num=n2[i];
            for(int j=0;j<n1.length;j++)
            {
                if(num==n1[j])
                {
                    sc++;
                    n1[j]=-1;
                }
            }
        }
        ans[0]=sc;ans[1]=fc;
        return ans;

    }
}