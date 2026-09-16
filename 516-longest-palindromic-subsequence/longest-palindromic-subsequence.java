class Solution {
int[][] dp = new int[2000][2000];
int fun( int i , int j , String s){


if( i > j) return 0;
if( i == j) return 1;


int m = 0;
if(dp[i][j] != -1){
    return dp[i][j];
}
if(s.charAt(i) == s.charAt(j)){

 return dp[i][j] = 2 + fun(i + 1, j - 1, s);

} 

    int a = fun( i + 1 , j , s);
    int b = fun ( i , j - 1 , s);

   
return dp[i][j] = Math.max(a, b);

}
    public int longestPalindromeSubseq(String s) {

     for (int i = 0; i < dp.length; i++) {
    for (int j = 0; j < dp[i].length; j++) {
        dp[i][j] = -1;
    }
}
int j = s.length() - 1;
return fun(0, j, s);

   
        
    }

}


    
