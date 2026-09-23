class Solution {



int[][] dp ;
boolean fun( String s1 , String s2 , String s3 , int i , int j , int k){

    // base case 
     if (i == s1.length() && j == s2.length()) {
            return k == s3.length();
        }

  if (i >= s1.length()) {
        
            while (j < s2.length() &&  k < s3.length()) {
                if( s2.charAt(j) != s3.charAt(k)){
                   return false;
                } 
               j++;
               k++;
            }
            return true;
  }
 if (dp[i][j] != -1) {
    return dp[i][j] == 1;
}

 if (j >= s2.length()) {
        

            while (i < s1.length() && k < s3.length()) {
             if(s1.charAt(i) != s3.charAt(k)){
                return false;
             }
             i++;
             k++;
            }
            return   true;
        }

boolean ans = false;
    if( s1.charAt(i) == s3.charAt(k) ){
    ans = fun( s1 , s2 , s3 , i+1 , j ,  k+1);
    } if( s2.charAt(j) == s3.charAt(k) ){
        ans = ans || fun( s1 , s2 , s3 , i ,j+1 , k+1);
    }

    // if( s1.charAt(i) != s3.charAt(k) && s2.charAt(j) != s3.charAt(k)){
    //     return false;
    // }
dp[i][j] = ans ? 1 : 0;
return ans;

}

    public boolean isInterleave(String s1, String s2, String s3) {

        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
   
  

dp = new int[s1.length() + 1][s2.length() + 1];

for (int i = 0; i < dp.length; i++) {
    Arrays.fill(dp[i], -1);
}
 
        return fun(s1, s2, s3, 0, 0, 0);

    }
}