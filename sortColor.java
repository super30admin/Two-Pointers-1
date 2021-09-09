class sortColor {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int low = 0, high = nums.length - 1, mid = 0;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            } else {
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

// TC: O(N) SC:O(1)