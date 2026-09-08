class Solution {

long [] dp = new long[100005];


long fun(int i, List<Integer> nums, HashMap<Integer, Integer> m1){
if (i >= nums.size()) {
            return 0;
        }

        int curr = nums.get(i);

      int id = nums.size();
 int m = 0;

   // DP check
        if (dp[i] != -1) {
            return dp[i];
        }

        for( int j = i + 1 ; j < nums.size() ; j++){

            if( nums.get(j) > nums.get(i) + 2 ){
                id = j;
                break;
            }
        }


long t = 1L * nums.get(i) * m1.get(nums.get(i)) + fun(id, nums, m1);
long nt = fun(i + 1, nums, m1);

   return dp[i] = Math.max(t, nt);
}
    public long maximumTotalDamage(int[] power) {
        
  // Create frequency map
        HashMap<Integer, Integer> m1 = new HashMap<>();

        for (int a : power) {
            m1.put(a, m1.getOrDefault(a, 0) + 1);
        }

        // Create list of unique numbers
        List<Integer> v1 = new ArrayList<>();

        for (int a : m1.keySet()) {
            v1.add(a);
        }

        // Sort the list
        Collections.sort(v1);

        // Initialize DP with -1
        Arrays.fill(dp, -1);

        return fun(0, v1, m1);


    }
}