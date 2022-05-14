class Solution {
    /**
     * Left pointer, right pointer, mid pointer
     * if mid is 2 give it to right, if mid is 0 give it to left
     * if mid is 1 increment mid. Done.
     * time: O(n)
     * soace: O(1)
     */
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            }

            if (mid <= right && nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            }

            if (mid <= right && nums[mid] == 1) {
                mid++;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
