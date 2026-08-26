class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void fun(List<Integer> nums, List<Integer> temp) {

        // Base case
        if (nums.size() == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

       for (int i = 0; i < nums.size(); i++) {

    if (i > 0 && nums.get(i).equals(nums.get(i - 1))) {
        continue;
    }

    List<Integer> ip = new ArrayList<>(nums);
    List<Integer> op = new ArrayList<>(temp);

    op.add(ip.remove(i));

    fun(ip, op);
}
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            arr.add(num);
        }

        fun(arr, new ArrayList<>());

        return ans;
    }
}