class Solution {
    public int findShortestSubArray(int[] nums) {
        /* if(nums.length==1) return 1;

         int freq[]=new int[50000];
         for(int i=0;i<nums.length;i++)
         {
            freq[nums[i]]++;
         }
         int max=Arrays.stream(freq).max().getAsInt();
         System.out.print(max);

         int sum=Integer.MAX_VALUE;
         for(int i=0;i<nums.length;i++)
         {
            int count=1; int val=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    val=j;
                }
            }
            if(count==max)
            {
                if((val-i)<sum)
                {
                    sum=val-i;
                }
            }
         }
         return sum+1;*/

        


        // Size 50000 is safe based on problem constraints (nums[i] ranges from 0 to 49999)
        int[] count = new int[50000];
        int[] firstSeen = new int[50000];
        int[] lastSeen = new int[50000];
        
        // Fill firstSeen array with -1 to indicate the number hasn't been encountered yet
        Arrays.fill(firstSeen, -1);
        
        int maxDegree = 0;
        
        // Single pass O(N) loop to collect all stats
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            // Record the first appearance of this number
            if (firstSeen[num] == -1) {
                firstSeen[num] = i;
            }
            
            // Constantly update the last appearance
            lastSeen[num] = i;
            
            // Increment frequency and track the global highest degree
            count[num]++;
            if (count[num] > maxDegree) {
                maxDegree = count[num];
            }
        }
        
        int minLength = Integer.MAX_VALUE;
        
        // Find the shortest subarray matching the maxDegree
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count[num] == maxDegree) {
                int length = lastSeen[num] - firstSeen[num] + 1;
                if (length < minLength) {
                    minLength = length;
                }
            }
        }
        
        return minLength;
    }
}

    