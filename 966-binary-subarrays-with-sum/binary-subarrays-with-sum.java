class Solution {

public int atmost( int [] nums , int goal){

int l = 0 , count = 0 , sum = 0 ;

if( goal < 0 ){
    return 0;
}

for( int r = 0 ; r < nums.length ; r ++ ){
    sum = sum + nums[r];
    while ( sum > goal){
        sum -= nums[l];
        l++;
    }
    count += r - l + 1;
}

return count;
}

    
    public int numSubarraysWithSum(int[] nums, int goal) {
        
      return atmost(nums , goal) - atmost(nums , goal - 1);
}
}