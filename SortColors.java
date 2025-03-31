public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++; // for nums[mid] == 1
            }
        }
    }

    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;

    }
}

/**
 * TC: O(n)
 * SC: O(1)
 */