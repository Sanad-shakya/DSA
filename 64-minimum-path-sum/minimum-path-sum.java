class Solution {

    int sum(int[][] grid, int i, int j, int[][] dp) {

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
   if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (j + 1 < grid[0].length) {
            right = sum(grid, i, j + 1, dp);
        }

        if (i + 1 < grid.length) {
            down = sum(grid, i + 1, j,dp);
        }
int min = Math.min(right , down);
        return dp[i][j] = grid[i][j] + min ;
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return sum(grid, 0, 0, dp);
    }
}