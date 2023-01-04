import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Was trying to do it without sorting but couldn't reach to a solution

/**
 * First Sort the array and then start comparing the first element with last element of the array.
 * If they are duplicates just move on to next element
 */
public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    // Sort the array
    Arrays.sort(nums);
    // Length of the array
    int n = nums.length;
    // Resultant list
    List<List<Integer>> threenumbers = new ArrayList<>();
    // Loop for each element of the array
    for (int i = 0; i < n; i++) {
      // Skip the duplicates
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      // Left and right pointers
      int j = i + 1;
      int k = n - 1;
      // Loop for all the remaining pairs
      while (j < k) {
        if (nums[i] + nums[j] + nums[k] == 0) {
          threenumbers.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          //To avoid duplicates
          while (j < k && nums[j] == nums[j - 1]) {
            j++;
          }
        } else if (nums[i] + nums[j] + nums[k] < 0) {
          j++;
        } else {
          k--;
        }
      }
    }
    return threenumbers;
  }

  public static void main(String[] args) {
    ThreeSum ts = new ThreeSum();
    int[] nums = {-1,0,1,2,-1,-4};
    System.out.println(ts.threeSum(nums));
  }
}
