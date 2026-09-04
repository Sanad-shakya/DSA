class Solution {

    public void  move(int nums[] , int i ) {
    
        if (i == nums.length) {
            return;
        }
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {

                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;

            }
        }
        move(nums, i+1);
        
    }

    public void moveZeroes(int[] nums) {

       for( int arrays : nums){
        move(nums, 0);
       }

    }
}
