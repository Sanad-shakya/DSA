class Solution {

int [][] dp = new int [1005][1005];
    int fun(int i, int j, String t, String v) {

        // s1 is finished
        if (i >= t.length()) {
            int sum = 0;

            while (j < v.length()) {
                sum += v.charAt(j);
                j++;
            }

            return sum;
        }

        // s2 is finished
        if (j >= v.length()) {
            int sum = 0;

            while (i < t.length()) {
                sum += t.charAt(i);
                i++;
            }

            return sum;
        }

          if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (t.charAt(i) == v.charAt(j)) {
            dp[i][j] = fun(i + 1, j + 1, t, v);
            return dp[i][j];
        }
          int ascii = (int)t.charAt(i);
        int c1 = ascii + fun(i + 1, j, t, v);
        int ascii2 = (int)v.charAt(j);
        int c2 = ascii2 + fun(i, j + 1, t, v);
        
       
int ans = Math.min(c1,c2);
      
      return dp[i][j]= ans;

    }

    
    public int minimumDeleteSum(String s1, String s2) {
        
   for(int i = 0; i < dp.length; i++) {
    for(int j = 0; j < dp[i].length; j++) {
        dp[i][j] = -1;
    }
}
 return fun(0, 0, s1, s2);
    }
}