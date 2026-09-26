import java.util.*;

class Solution {

    int[] dp = new int[1005];

    public int fun(int[][] pair, int i  ) {

        if (i == pair.length) {
            return 0;
        }

        if (dp[i]!= -1) {
            return dp[i];
        }

int id = pair.length;

int l = i + 1;
int h = pair.length-1;

while( l  <=h ){

    int mid = (l + h )/2;

if (pair[mid][0] > pair[i][1]) {
    id = mid;
    h = mid - 1;
}

    else 
    l = mid + 1;
}





        // Not take
 int take = 1 + fun(pair, id);
int nottake = fun(pair, i + 1);

        // Take
        // int take = 0;

        // if (p == -1 || pair[i][0] > pair[p][1]) {
        //     take = 1 + fun(pair, i + 1, i);
        // }

        return dp[i] = Math.max(take, nottake);
    }

    public int findLongestChain(int[][] pairs) {

     
            Arrays.fill(dp, -1);
        
  Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        return fun(pairs, 0 );
    }
}