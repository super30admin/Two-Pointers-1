// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem2 (https://leetcode.com/problems/3sum/)
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// Example 1:
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

// Example 2:
// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.

// Example 3:
// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
 
// Constraints:
// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Base Case: if less than 3 elements, no triplets can be formed
        if (nums.length < 3){
            return result;
        }
        
        // Sorting the array to use two-pointer and skip duplicates
        Arrays.sort(nums);

        // Fixing one number and use two pointers to find the other two numbers
        for (int i = 0; i < nums.length; i++){

            // Skipping duplicate elements to avoid repeated triplets
            if (i != 0 && nums[i] == nums[i - 1]){
                continue;
            }

            // Initializing left pointer to start from the next element of i and right pointer from last element
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){

                int currSum = nums[i] + nums[left] + nums[right]; // calculating current sum
                if(currSum == 0){
                    // Found a valid triplet, adding it to result list of lists
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skipping duplicates for left pointer
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;
                    }

                    // Skipping duplicates for right pointer
                    while (left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
                else if (currSum < 0){
                    // Sum is less than 0, moving left pointer to increase the sum
                    left++;
                }
                else {
                    // Sum is greater than 0, moving right pointer to decrease the sum
                    right--;
                }
            }
        }

        // Returning list of all unique triplets
        return result;
    }
}