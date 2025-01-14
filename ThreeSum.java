import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 * Ran on leetcode? Yes
 * Issues faced? None
 *
 * Approach:
 * Two pointers
 * 1. Sort the array
 * 2. Apply two pointers technique
 * 3. To avoid duplicates move left and right pointers by looking at the previous left and right values respectively
 * this avoids the use of extra space (hashmap/set)
 * 4. Avoiding unnecessary checks when the first element is positive by breaking the loop early
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // No triplet can exist with less than 3 numbers
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums); // O(nlogn)
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        // O(n)
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            if (nums[i] > 0) {
                break;
            }

            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Perform two pointers in subset of array
            while (left < right) { // O(n)
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Move pointers and skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Move pointers and skip duplicates
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] nums = {1,-9,6,8,2,0,-2,1,-1};
        List<List<Integer>> result = obj.threeSum(nums);
        System.out.println(result);
    }
}

