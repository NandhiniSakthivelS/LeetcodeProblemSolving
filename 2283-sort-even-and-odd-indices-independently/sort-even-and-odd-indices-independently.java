class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int m=nums.length/2;
        ArrayList<Integer> odd= new ArrayList<>();
        ArrayList<Integer> even= new ArrayList<>();
        int ec=0,oc=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || i%2==0)
            {
                even.add(nums[i]); 
            }
            else
            {
                odd.add(nums[i]); 
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int e=0,o=odd.size()-1;
        System.out.print(odd);
        System.out.print(even);
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
           nums[i] = even.get(e++);
           else
           nums[i] = odd.get(o--);
        }
        return nums;
    }
}