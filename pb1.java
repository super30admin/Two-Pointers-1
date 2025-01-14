class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--; // Move the right pointer to exclude the swapped 2
            } else if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++; // Move the left pointer to include the swapped 0
                mid++;  // Move mid forward as the current element is processed
            } else {
                mid++; // If nums[mid] == 1, just move the mid pointer forward
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
