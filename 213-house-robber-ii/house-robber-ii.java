class Solution {

   int [][] dp = new int[102][2];

   int fun( int[]nums , int i , int f){
  
  if( i == nums.length -1){
    if( f == 1) return 0;{
      }  return nums[i];
  }
  
   if(dp[i][f] !=-1) return dp[i][f];

   if(i>=nums.length)
   {
    return 0;
   }
   int nf = f;

   if(i == 0){
    nf = 1;
   } 
   
  int rob = nums[i] + fun(nums, i+2 , nf);
  int not_rob = fun(nums, i+1 , f);

  return dp[i][f]= Math.max(rob, not_rob);


}


    public int rob(int[] nums) {

      for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = fun(nums , 0 , 0);
     return ans;
    }
}