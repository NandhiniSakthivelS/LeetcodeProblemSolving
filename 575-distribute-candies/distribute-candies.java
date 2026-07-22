class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int eat = candyType.length/2;
        int type=0;int temp=candyType[0]-1;
        for(int i=0;i<candyType.length;i++)
        {
           if(candyType[i]!=temp)
           {
            type++;
            temp=candyType[i];
           }
        }
        if(eat<type) return eat;
        return type;
    }
}