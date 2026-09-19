class Solution {

int [][] dp = new int [3000][3000];

 int fun( int []nums , int i , int p){

 if( i >=  nums.length){
    return 0;
 }

if( dp[i][p+1] != - 1){
    return dp[i][p+1];
}

  int a = 0;
if( p == -1 || nums[i] > nums[p]){

   a = 1 + fun( nums , i+1 , i);

} 
    
    int b = fun( nums , i + 1 , p);

 return dp[i] [p+1] = Math.max(a,b);
 }
    public int lengthOfLIS(int[] nums) {


     for (int i = 0; i < dp.length; i++) {
    for (int j = 0; j < dp[i].length; j++) {
        dp[i][j] = -1;
    }
}

       return fun( nums , 0 , -1);
    }
}