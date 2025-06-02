// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// The algorithm uses three pointers (low, mid, and high) to partition the array into three sections for 0s, 1s, and 2s. 
//It scans the array once, swapping elements to move 0s to the front, 2s to the end, and leaving 1s in the middle. 
//This in-place process ensures the array is sorted in a single pass without extra space.
class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid =0, high = nums.length-1;

    while (mid <= high) {
    if (nums[mid] == 1) mid++;
    else if (nums[mid] == 0) swap(nums, low++, mid++);
    else swap(nums, mid, high--);
    }
    }

private void swap(int[] nums, int i, int j) {
int temp = nums[i];
nums[i] = nums[j];
nums[j] = temp;
    }
}
// Your code here along with comments explaining your approach
