class Solution {

int [][]dp = new int [102][102];
int fun ( int i , int j , int n , int m){

 // out of bound 

 if( i >= m || j >= n){
    return 0;
 }
// reach the end 
if( i == m-1 && j == n-1){
    return 1;
}
if(dp[i][j] != -1){
    return dp[i][j];
}

// choices 

int right =  fun(i , j + 1 ,  n , m );
int down = fun( i + 1 , j , n , m);

return dp[i][j] = right + down;
}

    public int uniquePaths(int m, int n) {


 for (int i = 0; i < 102; i++) {
            Arrays.fill(dp[i], -1);
        }
   

        return fun(0, 0 , n, m);


    }
}