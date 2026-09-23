class Solution {

  
int [][] dp = new int [1005][1005];
    int fun(int i, int j, String t, String v) {

     if (i >= t.length() || j >= v.length()) {
            return 0;
        }
        if( dp[i][j] != -1){
           
           return dp[i][j];

        }

        if (t.charAt(i) == v.charAt(j)) {
            dp[i][j] = 1 + fun(i + 1, j + 1, t, v);
return dp[i][j];
        }

        int c1 = fun(i + 1, j, t, v);
        int c2 = fun(i, j + 1, t, v);

        return dp[i][j] = Math.max(c1, c2);
    }


    public int minDistance(String word1, String word2) {
        
    for(int i = 0; i < dp.length; i++) {
    for(int j = 0; j < dp[i].length; j++) {
        dp[i][j] = -1;
    }
}

    int ans = fun(0, 0, word1, word2);
    int n = word1.length();
    int m = word2.length();

   return ans = (n+m) - (2*ans);


    }
}