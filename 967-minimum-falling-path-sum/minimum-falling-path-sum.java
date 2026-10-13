class Solution {
    public int solve(int[][] matrix,int i,int j,int[][] dp){
        int n=matrix.length;
        int m=matrix[0].length;
        if(j<0 || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
       int c1=solve(matrix,i+1,j-1,dp);
       int c2=solve(matrix,i+1,j,dp);
       int c3=solve(matrix,i+1,j+1,dp);
       dp[i][j]=matrix[i][j]+Math.min(c1,Math.min(c2,c3));
       return dp[i][j];
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            ans=Math.min(ans,solve(matrix,0,j,dp));
        }
        return ans; 
    }
}