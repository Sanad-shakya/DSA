class Solution {

int [][] dp = new int[505][505];


public int solve( int p , int i , int [] arr, int k , int m ){

    if( i>=arr.length) return 0;

    int ans = 0;

    m = Math.max(m,arr[i]);
     
    int len = i - p + 1;
if( dp[i][p] != -1){


return dp[i][p];


}
    if(len == k){
        int c1 = (m*len)+ solve(i+1 , i + 1 , arr , k , 0);
        ans = Math.max(m , c1);
    } else 
{
    int c1 =(m*len)+ solve(i+1 , i + 1 , arr , k , 0);
    int c2 = solve(p , i + 1 , arr , k , m  );
    ans =  Math.max( ans , c1);
    ans =  Math.max( ans , c2);
}
return dp[i][p] = ans;
}


    public int maxSumAfterPartitioning(int[] arr, int k) {
        for( int i = 0 ; i<505 ; i++){
      Arrays.fill(dp[i] , -1);
        }

        return solve(0 , 0 , arr , k , 0);
    }
}