// In this approach, we are sorting the array, running a outer loop and using 2 pointers in inner loop, checking if the sum is ==0, 
// moving both pointers, if sum<0, moving left else right

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

// Brute force O(n^3) and giving time limit exceeded
class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        // Check for base condition
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        // Declare a hashset to handle duplicates in result list
        HashSet<List<Integer>> set = new HashSet<>();
        // Declare result list
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        // Run 3 loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the sum is 0
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Create a list of this combination
                        List<Integer> res = Arrays.asList(nums[i], nums[j], nums[k]);
                        // Sort this combination
                        Collections.sort(res);
                        // Check if this combination exists in set
                        if (!set.contains(res)) {
                            // if not, than add it to set and result both
                            set.add(res);
                            result.add(res);
                        }
                    }
                }
            }
        }
        // Return result
        return result;
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Check for base condition
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        // Declare result list
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        // Sort the nums array since we are going to use to pointers
        Arrays.sort(nums);
        // Start outer loop
        for (int i = 0; i < n; i++) {
            // Check if the element i is same as previous one, just move on to avoid
            // duplicate triplets in result
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // If i is >0, there is no way we will find triplet which sums upto zero because
            // our nums is sorted and our L is i+1 and R is n-1
            if (nums[i] > 0) {
                // In that case break
                break;
            }
            // Declare left and right
            int left = i + 1;
            int right = n - 1;
            // Run inner loop till left is less than right
            while (left < right) {
                // Calc sum of three present at i, left and right
                int sum = nums[i] + nums[left] + nums[right];
                // Check if sum is == 0, that means triplet found
                if (sum == 0) {
                    // Add it to the result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Increment both left and right till they different than there previous values
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    // If sum is less than zero, only move left till is different than it previous
                    // value
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    // If sum is > than zero, only move right till is different than it previous
                    // value
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
