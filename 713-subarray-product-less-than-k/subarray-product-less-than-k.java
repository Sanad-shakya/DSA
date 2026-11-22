class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int pro = 1, l = 0 , count = 0;

        for( int r = 0 ; r < nums.length ; r++) {

            pro = pro*nums[r];

            while (pro >= k) { // if pro becomes greater or equal to k 

                pro = pro/nums[l];
                l++;
            }
            count += r - l + 1;
          
        }

        return count;

    }

}
