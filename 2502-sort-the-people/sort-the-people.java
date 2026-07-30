class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int ref[]=heights.clone(); // 180,165,170
        
        String ans[]=new String[names.length];
        
        Arrays.sort(ref); // 165,170,180
       
        int count=0;
        
        for(int i=ref.length-1;i>=0;i--)
        {
            for(int j=0;j<heights.length;j++)
            {
                if(heights[j]==ref[i]) ans[count++] = names[j];
            }
        }
        return ans;
    }
}