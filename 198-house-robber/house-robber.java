class Solution {

int dp[] = new int [102];
public int fun(int i, int arr[]){

  // base case 
 if( i >= arr.length){
    return 0;
}

if(dp[i] != -1)
    return dp[i];


  // choice 
   
   int c1 = arr[i] + fun(i+2,arr);
   int c2 = fun(i+1,arr);

int ans = Math.max(c1, c2);

     dp[i] = ans;

 return ans;

}
    public int rob(int[] nums) {
     Arrays.fill(dp, -1);
     int ans = fun (0,nums);
     return ans;
    }
}