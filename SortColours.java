// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public void sortColors(int[] nums) {
    int n = nums.length;
    int left = 0, mid = 0;
    int right = n-1;
    while(mid<=right) {
      // Case 1 when number encountered is 2
      if(nums[mid] == 2) {
        swap(nums, mid, right);
        right--;
        // Case 2 when number encountered is 0
      }else if(nums[mid] == 0) {
        swap(nums, mid, left);
        left++;
        mid++;
        // Case 3 when number encountered is 1
      }else {
        mid++;
      }
    }
  }

  // Swap function two swap two values in an array.
  void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
}