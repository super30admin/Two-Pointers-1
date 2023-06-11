public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        int j = nums.length - 1;
        int mid = 0;
        while (mid <= j) {
            if (nums[mid] == 2) {
                swap(nums, mid, j);
                j--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, i);
                i++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int nums[], int i, int j) {
        if (i == j)
            return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
