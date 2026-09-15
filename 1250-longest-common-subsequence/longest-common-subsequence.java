class Solution {


int [][] dp = new int [1005][1005];
    int fun(int i, int j, String t, String v) {

        // Boundary condition FIRST
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

    public int longestCommonSubsequence(String text1, String text2) {
for (int i = 0; i < dp.length; i++) {
    for (int j = 0; j < dp[i].length; j++) {
        dp[i][j] = -1;
    }
}

        return fun(0, 0, text1, text2);
    }
}