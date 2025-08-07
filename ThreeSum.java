import java.util.*;
// Time Complexity : O(nlogn) + O(n^2) where n is the length of the array
// Space Complexity : O(1) if we ignore the space used by the result list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Initially struggled with skipping duplicates and placing result addition inside the loop correctly

// Your code here along with comments explaining your approach:
// The idea is to sort the array first to make it easier to use the two-pointer approach.
// For each number, fix it and find two other numbers that make the total sum = 0 using two pointers.
// To avoid duplicates, skip over repeated elements at every level (i, left, right).
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // Sorting helps with duplicate handling and two-pointer logic
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int sum = 0 - nums[i];  // We want nums[l] + nums[r] = -nums[i]
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int twoSum = nums[l] + nums[r];
                if (twoSum == sum) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Skip duplicates for the second and third elements
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                } else if (twoSum < sum) {
                    l++;  // Increase left pointer to increase the sum
                } else {
                    r--;  // Decrease right pointer to reduce the sum
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        ThreeSum sol = new ThreeSum();

        //  Test case 1: Normal case with multiple triplets
        System.out.println("Test 1: " + sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        // Expected: [[-1, -1, 2], [-1, 0, 1]]

        //  Test case 2: Edge case with duplicates
        System.out.println("Test 2: " + sol.threeSum(new int[]{0, 0, 0, 0}));
        // Expected: [[0, 0, 0]]

        //  Test case 3: No valid triplets
        System.out.println("Test 3: " + sol.threeSum(new int[]{1, 2, 3, 4}));
        // Expected: []

        //  Test case 4: Mixed negatives and positives
        System.out.println("Test 4: " + sol.threeSum(new int[]{-2, 0, 1, 1, 2}));
        // Expected: [[-2, 0, 2], [-2, 1, 1]]

        //  Test case 5: Less than 3 elements
        System.out.println("Test 5: " + sol.threeSum(new int[]{0, 1}));
        // Expected: []
    }
}
