import java.util.*;

class Solution {

    int[][] dp = new int[1005][1005];

    public int fun(int[][] pair, int i, int p) {

        if (i == pair.length) {
            return 0;
        }

        if (dp[i][p + 1] != -1) {
            return dp[i][p + 1];
        }

        // Not take
        int nottake = fun(pair, i + 1, p);

        // Take
        int take = 0;

        if (p == -1 || pair[i][0] > pair[p][1]) {
            take = 1 + fun(pair, i + 1, i);
        }

        return dp[i][p + 1] = Math.max(take, nottake);
    }

    public int findLongestChain(int[][] pairs) {

        for (int i = 0; i < 1005; i++) {
            Arrays.fill(dp[i], -1);
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        return fun(pairs, 0, -1);
    }
}