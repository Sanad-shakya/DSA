class Solution {

    public int lengthOfLIS(int[] nums) {
        
    int n = nums.length;

    List<Integer> ans = new ArrayList<>();
    ans.add(nums[0]);

    for( int i = 1 ; i<n ; i++){

        if(ans.get(ans.size()-1) < nums[i]){
            ans.add(nums[i]);
        }else{
            int j = 0;
            while(ans.get(j) < nums[i]){
                j++;
            }
            ans.set(j , nums[i]);
        }
    }


return ans.size();
    }
}