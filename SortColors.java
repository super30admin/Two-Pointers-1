// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: we take two pointer, i and j, and an index pointer.
// Whenever we see 0 at index position, we swap it with ith position
//  and whenever we see 2 at jth position, we swap index value with it.

// LC- 75. Sort Colors

public class SortColors {
  public void sortColors(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return;
    }

    int i = 0, j = nums.length - 1, index = 0;
    while (i < j && index <= j) {
      if (nums[index] == 0) {
        int temp1 = nums[index];
        nums[index] = nums[i];
        nums[i] = temp1;

        index++;
        i++;
      } else if (nums[index] == 2) {
        int temp2 = nums[index];
        nums[index] = nums[j];
        nums[j] = temp2;
        j--;
      } else {
        index++;
      }
    }
  }
}
