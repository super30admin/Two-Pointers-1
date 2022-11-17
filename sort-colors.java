//time complexity is O(n)
//space is O(1)
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

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

    private void swap(int[] nums, int mid, int index) {

        int temp = nums[index];
        nums[index] = nums[mid];
        nums[mid] = temp;
    }
}