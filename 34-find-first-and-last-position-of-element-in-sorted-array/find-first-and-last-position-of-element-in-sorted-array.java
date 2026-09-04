class Solution {

public int first( int[] nums , int target){

       int left = 0;
     int right = nums.length-1;
 int ans = -1;
 // first occurance 
     while( left <= right ){
        int mid = left + ( right - left)/2;

        if(nums[mid] == target){
            ans = mid ;
            right = mid -1;
        }
        else if( nums[mid] < target){
             left = mid + 1;
        }
        else right = mid -1;
     }

return ans;
}

public int lastOccurrance( int[]nums , int target){

int left = 0;
     int right = nums.length-1;
 int ans = -1;

while( left <= right ){
int mid = left + ( right - left)/2;
        if(nums[mid] == target){
            ans = mid ;
            left = mid + 1;
        }
        else if( nums[mid] < target){
             left = mid + 1;
        }
        else right = mid -1;
     }

           return ans ;
}

    public int[] searchRange(int[] nums, int target) {
        
        int []ans = new int[2];

        ans[0]=first(nums , target);
        ans[1]=lastOccurrance(nums , target);

   
   return ans;

    }
}