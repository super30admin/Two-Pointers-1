// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SortColors {
  public void sortColors(int[] nums) {
    if (nums == null || nums.length == 0) {
      return;
    }
    int left = 0;
    int mid = 0;
    int right = nums.length - 1;
    while (mid <= right) {
      if (nums[mid] == 2) {
        swap(nums, mid, right);
        right--;
      } else if (nums[mid] == 0) {
        swap(nums, mid, left);
        left++;
        mid++;
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
