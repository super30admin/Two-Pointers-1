public class SortColors {
    // TC O(N)
    // SC O(1)
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0, j = nums.length - 1, k = 0;
        while (k <= j) {
            if (nums[k] == 0) {
                swap(nums, k, i);
                i++;
                k++;
            } else if (nums[k] == 2) {
                swap(nums, k, j);
                j--;
            } else {
                k++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
