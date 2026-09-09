class Solution {

int [] dp = new int[1005];


    public int cost(int i, int[] cost, int[] days) {

        // base case
        if (i >= days.length) {
            return 0;
        }


if( dp[i] != -1){
    return dp[i];
}
        // 1-day pass
        int id1 = i + 1;

        // 7-day pass
        int id2 = days.length;

        for (int j = i + 1; j < days.length; j++) {

            if (days[j] >= days[i] + 7) {
                id2 = j;
                break;
            }
        }

        // 30-day pass
        int id3 = days.length;

        for (int j = i + 1; j < days.length; j++) {

            if (days[j] >= days[i] + 30) {
                id3 = j;
                break;
            }
        }

        // choices
        int c1 = cost[0] + cost(id1, cost, days);
        int c2 = cost[1] + cost(id2, cost, days);
        int c3 = cost[2] + cost(id3, cost, days);

        int min = Math.min(c1, Math.min(c2, c3));

        return dp[i]=min;
    }

    public int mincostTickets(int[] days, int[] costs) {
Arrays.fill(dp , -1);
        int ans = cost(0, costs, days);

        return ans;
    }
}