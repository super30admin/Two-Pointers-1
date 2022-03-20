// Time Complexity : O(n) where n is the length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// CODE:

public class sortColors {
    public void sort_Colors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 2) { // taking care of '2' with high , '1' with mid , '0' with low
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++; // doing mid++ because else it will be be behind low in few cases
            } else {
                mid++; // if nums[mid]==0
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
