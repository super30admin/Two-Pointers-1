// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class SortColors {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = low;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}