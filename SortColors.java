// Two pointers O(n) time, O(1) space
class Solution {
    public void sortColors(int[] nums) {
        int left = 0; // collects 0s (red)
        int mid = 0; // collects 1s (white)
        int right = nums.length-1; // collects 2s (blue)

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(mid, left, nums);
                left++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(mid, right, nums);
                right--;
            }
        }
    }
    private void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}