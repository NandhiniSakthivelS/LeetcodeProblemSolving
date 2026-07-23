class Solution {
    public int diagonalSum(int[][] mat) {
        int fsum=0;
        int ssum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j) fsum+=mat[i][j];
                if(i+j ==mat[0].length-1)ssum+=mat[i][j];
            }
        }
        int col=mat.length/2;
        int row = mat[0].length/2;
        int ans=ssum+fsum;
        if(mat.length%2!=0) ans-=mat[col][row];
        return ans;
    }
}