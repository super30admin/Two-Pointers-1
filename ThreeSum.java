/*
Approach 1 — HashSet based (O(n^2) time, O(n) space)
- Fix the first element nums[i], and look for two other numbers whose sum equals -nums[i].
- Use a HashSet to store numbers we've seen so far in the current iteration for quick complement lookup.
- Store triplets in a HashSet<List<Integer>> to avoid duplicates.
*/

// Time Complexity : O(n^2)
// Space Complexity : O(n) extra (for the HashSet in each loop + storing results)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Handling duplicates without sorting every time was tricky.

import java.util.*;

public class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int target = 0 - nums[i];
            HashSet<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet); // ensure uniqueness
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}

/*
Approach 2 — Binary Search after sorting (O(n^2 log n) time, O(1) extra space)
- Sort the array first to simplify duplicate handling.
- Fix nums[i], then fix nums[j], and use binary search to find the third number.
- Store unique triplets in a HashSet<List<Integer>> to avoid duplicates.
*/

// Time Complexity : O(n^2 log n) due to binary search inside two loops
// Space Complexity : O(1) extra (apart from result storage)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Needed to be careful with binary search boundaries and duplicates.

class ThreeSumBinarySearch {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int target = 0 - nums[i];

            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];
                int idx = binarySearch(nums, j + 1, n - 1, complement);

                if (idx != -1) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
            }
        }
        return new ArrayList<>(result);
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

/*
Approach 3 — Two Pointers after sorting (Optimal, O(n^2) time, O(1) space)
- Sort the array so we can use the two-pointer method.
- Fix nums[i], then use left and right pointers to find pairs summing to -nums[i].
- Move pointers inward based on sum comparison and skip duplicates.
*/

// Time Complexity : O(n^2)
// Space Complexity : O(1) extra (apart from result storage)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Handling pointer movement and skipping duplicates correctly was the main challenge.

class ThreeSumTwoPointers {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate first elements

            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    while (low < high && nums[low] == nums[low - 1]) low++; // skip duplicates
                    while (low < high && nums[high] == nums[high + 1]) high--; // skip duplicates
                }
                else if (sum < 0) {
                    low++;
                }
                else {
                    high--;
                }
            }
        }
        return result;
    }
}
