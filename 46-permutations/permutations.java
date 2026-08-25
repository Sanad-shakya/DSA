class Solution {

List<List<Integer>> ans = new ArrayList<>();

public void fun( List<Integer>nums , List<Integer> temp){
 
   
    // base case 
if(nums.size() == 0){
    ans.add(new ArrayList<>(temp));
    return;
}
   // input output 

   for( int i = 0 ; i < nums.size() ; i++){

List<Integer> ip = new ArrayList<>(nums);
List<Integer> op = new ArrayList<>(temp);


op.add(nums.get(i));
ip.remove(i);
   fun(ip, op);
}
}

    public List<List<Integer>> permute(int[] nums) {
         List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        fun(arr, new ArrayList<>());

        return ans;
    }
}