import java.util.*;

class Solution {

    int[] dp = new int[20005];

    int fun(int i, List<Integer> nums, HashMap<Integer, Integer> m1) {

        // Base case
        if (i == nums.size() - 1) {
            return nums.get(i) * m1.get(nums.get(i));
        }

        // Out of bounds
        if (i >= nums.size()) {
            return 0;
        }

        // DP check
        if (dp[i] != -1) {
            return dp[i];
        }

        int m = 0;

        // If next number is consecutive
        if (i + 1 < nums.size()
                && nums.get(i + 1) == nums.get(i) + 1) {

            int a = (nums.get(i) * m1.get(nums.get(i)))
                    + fun(i + 2, nums, m1);

            m = Math.max(m, a);
        }

        // If next number is NOT consecutive
        if (i + 1 < nums.size()
                && nums.get(i + 1) != nums.get(i) + 1) {

            int a = (nums.get(i) * m1.get(nums.get(i)))
                    + fun(i + 1, nums, m1);

            m = Math.max(m, a);
        }

        // Don't take current number
        int a = fun(i + 1, nums, m1);

        m = Math.max(m, a);

        return dp[i] = m;
    }


    public int deleteAndEarn(int[] nums) {

        // Create frequency map
        HashMap<Integer, Integer> m1 = new HashMap<>();

        for (int a : nums) {
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