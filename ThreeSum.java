// TC: O(n^2 log n)
// SC: O(1)
// Approach: 
// 1. Sort the array 
// 2. Consider first element and run two pointer approach on the rest of the array.
// 3. If sum of i, low and high is 0 add to result list
// 4. else if sum > 0 move high pointer else if sum < 0 move low pointer
// 5. Check for duplicacy inside subarray and in main array if there is duplicate skip that element and continue
// 6. If nums[i] is greater than 0 simply break because array is sorted you will never find any element to sum it to 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    Arrays.sort(nums);

    for (int i = 0; i < n - 2; i++) {
      // outside duplicacy
      if (i != 0 && nums[i] == nums[i - 1])
        continue;
      if (nums[i] > 0)
        break;
      int low = i + 1;
      int high = n - 1;

      while (low < high) {
        int currSum = nums[i] + nums[low] + nums[high];
        if (currSum == 0) {
          List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
          result.add(li);
          low++;
          high--;
          while (low < high && nums[low] == nums[low - 1]) {
            low++;
          }
          while (low < high && nums[high] == nums[high + 1]) {
            high--;
          }
        } else if (currSum > 0) {
          // move high pointer
          high--;
        } else {
          // move low pointer
          low++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    ThreeSum ts = new ThreeSum();
    int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
    System.out.println(ts.threeSum(nums));
  }
}
