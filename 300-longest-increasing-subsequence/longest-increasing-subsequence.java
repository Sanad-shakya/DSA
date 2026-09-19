class Solution {

    public int lengthOfLIS(int[] nums) {
        
    int n = nums.length;

    List<Integer> ans = new ArrayList<>();
    ans.add(nums[0]);

    for( int i = 1 ; i<n ; i++){

        if(ans.get(ans.size()-1) < nums[i]){
            ans.add(nums[i]);
        }      else{

                int low = 0;
                int high = ans.size() - 1;

                while (low < high) {

                    int mid = low + (high - low) / 2;

                    if (ans.get(mid) < nums[i]) {
                        low = mid + 1;
                    } 
                    else {
                        high = mid;
                    }
                }
                   ans.set(low, nums[i]);
    }


    }
return ans.size();

    }
}