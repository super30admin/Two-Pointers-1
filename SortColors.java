/** Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
* TC - O(n). Space complexity O(1)
* Submitted on leetcode
*/
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int low = 0, mid = 0, high = nums.length -1;
        while(mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid ++;
                low ++;
            }
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high --;
            } else {
                mid++;
            }
        }
    }
    private void swap(int [] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2]= temp;
    }
}
