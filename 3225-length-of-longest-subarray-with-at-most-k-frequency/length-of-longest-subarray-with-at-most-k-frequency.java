class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int start = 0;
        int end = 0;
        int maxLen= 0;
        int n = nums.length;
        HashMap<Integer , Integer> freqmap = new HashMap<>();

        while( end < n){

            // include 
            freqmap.put(nums[end], freqmap.getOrDefault(nums[end] , 0)+1);
            // invalid window
            while( freqmap.get(nums[end]) > k ){
               
   freqmap.put(nums[start], freqmap.getOrDefault(nums[start], 0) - 1);
start++;

            }

maxLen = Math.max(maxLen , end  - start + 1);
end++;
        }

return maxLen;
    }
}