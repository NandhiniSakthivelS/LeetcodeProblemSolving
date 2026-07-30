class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        for(int i=max;i>=1;i--)
        {
            if(min%i==0 &&  max%i==0) return i;
        }
        return 0;

    }
}