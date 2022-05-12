import java.util.*;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
public class ThreeSum {

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    Arrays.sort(nums);

    for (int firstIdx = 0; firstIdx < nums.length - 2; ++firstIdx) {
      if (firstIdx > 0 && nums[firstIdx] == nums[firstIdx - 1]) {
        continue;
      }

      int secondIdx = firstIdx + 1;
      int thirdIdx = nums.length - 1;

      int requiredSum = 0 - nums[firstIdx];

      while (secondIdx < thirdIdx) {
        int currentSum = nums[secondIdx] + nums[thirdIdx];

        if (currentSum < requiredSum) {
          ++secondIdx;
        } else if (currentSum > requiredSum) {
          --thirdIdx;
        } else {
          result.add(List.of(nums[firstIdx], nums[secondIdx], nums[thirdIdx]));
          ++secondIdx;
          while (secondIdx < thirdIdx && nums[secondIdx] == nums[secondIdx - 1]) {
            ++secondIdx;
          }
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    ThreeSum solution = new ThreeSum();

    int[] nums1 = { -1, 0, 1, 2, -1, -4 };

    for (List<Integer> row1 : ThreeSum.threeSum(nums1)) {
      System.out.print("[");
      for (int val : row1) {
        System.out.print(val + " ");
      }
      System.out.print("]");
      System.out.println();
    }

    int[] nums2 = { 0 };

    for (List<Integer> row2 : ThreeSum.threeSum(nums2)) {
      System.out.print("[");
      for (int val : row2) {
        System.out.print(val + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }

}
