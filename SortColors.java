public class SortColors {
    // TC: O(N) where N is length of nums
    // SC: O(1)
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else {
                swap(nums, mid, left);
                left++;
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
