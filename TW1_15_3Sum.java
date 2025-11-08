/**** Method 1 ****/
//Time Complexity: O(n^3)
//Space Complexity: O(n)

//TLE when submitted in LeetCode

// We will user 3 nested for loops to find the triplet which sums to zero, we will use a HashSet to avoid duplicates and at end we will convert the HashSet to list of lists and return it.

/**** Method 2 ****/
//Time Complexity: O(n^2)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

// We will sort the array first, then we will fix one element and use two pointers to find the other two elements which sums to zero, we will avoid duplicates by skipping the same elements.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TW1_15_3Sum {

  public static void main(String[] args) {}

  /**** Method 1 ****/
  public List<List<Integer>> threeSum1(int[] nums) {
    int n = nums.length;

    int target = 0;

    HashSet<List<Integer>> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (nums[i] + nums[j] + nums[k] == target) {
            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
            Collections.sort(list);
            set.add(list);
          }
        }
      }
    }

    return new ArrayList<>(set);
  }

  /**** Method 2 ****/
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      int j = i + 1;
      int k = nums.length - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];

        if (sum == 0) {
          ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
          while (j < k && nums[j] == nums[j + 1]) j++;
          while (j < k && nums[k] == nums[k - 1]) k--;
          j++;
          k--;
        } else if (sum > 0) {
          k--;
        } else {
          j++;
        }
      }
      while (i + 1 < nums.length - 2 && nums[i] == nums[i + 1]) i++;
    }

    return ans;
  }
}
