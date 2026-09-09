class Solution {
int [] dp = new int[1005];
public int cost ( int[] arr ,int i ){

// base case 

if( i >= arr.length){
    return 0;
}

if( dp[i] != -1){
    return dp[i];
}

// choice 
int cost1 = arr[i] + cost( arr , i+2);
int cost = arr[i] + cost( arr , i+1);
int min = Math.min(cost , cost1);
return dp[i] = min;
}
    public int minCostClimbingStairs(int[] cost) {
         Arrays.fill(dp,-1);
        int ans2 = cost(cost,0);
        int ans1 = cost(cost,1);
   
  return Math.min(ans1, ans2);
    }
}