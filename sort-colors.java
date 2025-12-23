class Solution {
    public void sortColors(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;

            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int mid, int loh) {
        int temp = nums[loh];
        nums[loh] = nums[mid];
        nums[mid] = temp;
    }
}

//TC:O(n)
//SC: O(1)