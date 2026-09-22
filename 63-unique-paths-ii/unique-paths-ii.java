class Solution {
int [][]dp = new int [102][102];
int fun ( int i , int j , int grid[][] , int n , int m){

 // out of bound 

 if( i >= m || j >= n){
    return 0;
 }

if( grid[i][j] == 1){
    return 0;
}

if( i == m-1 & j == n-1){
    return 1;
}
if(dp[i][j] != -1){
    return dp[i][j];
}

// choices 

int right =  fun(i , j + 1 , grid , n , m );
int down = fun( i + 1 , j , grid , n , m);

return dp[i][j] = right + down;

}
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
          for (int i = 0; i < 102; i++) {
            Arrays.fill(dp[i], -1);
        }


        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        return fun(0, 0, obstacleGrid, n, m);


    }
}