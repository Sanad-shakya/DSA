class Solution {

int fun( int n , int [] dp){
  if(n == 0) return 0;
        if( n==1) return 1;
if( dp[n] != -1){
    return dp[n];
}
        int small1 = fun(n-1  , dp );
        int small2 = fun(n-2 , dp );
        
        
        
        return dp[n] = small1  + small2 ; 
}

    public int fib(int n  ) {
        int [] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return fun(n, dp);
              }
}