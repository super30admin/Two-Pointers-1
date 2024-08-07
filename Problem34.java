// Time Complexity: O(n)
// Space Complexity: O(1)
// Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;  // Pointer for the boundary of 0s
        int high = nums.length - 1;  // Pointer for the boundary of 2s
        int curr = 0;  // Pointer for traversing the array
        
        while (curr <= high) {
            if (nums[curr] == 0) {
                swap(nums, low, curr);
                low++;
                curr++;
            } else if (nums[curr] == 1) {
                curr++;
            } else {
                swap(nums, curr, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
