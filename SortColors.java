// Time Complexity O(n)
// Space Complexity O(1)
// Runs on LeetCode: YES
class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length - 1;
        int mid = 0;

        while (mid <= two) {
            if (mid <= two && nums[mid] == 0) {
                swap(nums, mid, zero);
                zero++;
                mid++;
            } else if (mid <= two && nums[mid] == 2) {
                swap(nums, mid, two);
                two--;
            } else if (mid <= two && nums[mid] == 1) {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int mid, int index) {
        int temp = nums[mid];
        nums[mid] = nums[index];
        nums[index] = temp;
    }
}
