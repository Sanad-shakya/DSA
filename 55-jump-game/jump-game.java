class Solution {
int []dp = new int[100005];
public boolean jump( int []arr , int i ){

   // base case 

   if( i >= arr.length -1 ){
    return true;
   }

   if( dp[i] != -1){
    return dp[i] == 1;
   }
   for( int j = 1 ; j <= arr[i]; j++){
 int step1 = i + j ; 

 if( jump(arr , step1 )){
    dp[i] = 1;
    return true;
 }
 
}
dp[i] = 0;
return false;
}

    public boolean canJump(int[] nums) {
    
        Arrays.fill(dp , -1);
        return jump(nums , 0);

    }
}