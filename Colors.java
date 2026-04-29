// Time Complexity :O(N) where N is the length of the input array, as we are traversing the array once. 
// Space Complexity :o(1) as we are using constant extra space for the pointers and temporary variable for swapping.
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// We will use three pointers, low, mid and high.
// The low pointer will keep track of the position where the next 0 should be placed, 
// the mid pointer will traverse the array and the high pointer will keep track of the position where the next 2 should be placed.
// We will iterate through the array with the mid pointer and if we encounter a 0,
//  we will swap it with the element at the low pointer and move both pointers forward.
// If we encounter a 2, we will swap it with the element at the high pointer and move the high pointer backward.
// If we encounter a 1, we will simply move the mid pointer forward.
class Solution {

    public void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}