//Time Complexity:O(N)
//Space Complexity:O(1)
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else{
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