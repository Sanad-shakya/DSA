class Solution {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    void mergeSort(int[] nums, int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(nums, left, mid);

        // Sort right half
        mergeSort(nums, mid + 1, right);

        // Merge both sorted halves
        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;

        int[] temp = new int[right - left + 1];

        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Remaining elements from right
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy sorted elements back
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }}