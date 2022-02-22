// Time Complexity : O(n2 + nlogn) = O(n2) where n = length of nums array
// Space Complexity : O(log(n)) or O(n) depending on sort because Arrays.sort uses Dual Pivot Quick sort, where n = length of nums array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem2 {

    public static List<List<Integer>> threeSum(int[] nums) {
        // Sort the nums array in ascending order
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        // Iterate through each element in the nums array and consider it to be the first element in the threesum
        for (int i = 0; i < nums.length - 2; i++) {
            // Ignore repeated cases for first element of threesum as it will result in duplicates
            if (i != 0 && nums[i]==nums[i-1]) {
                continue;
            }
            // Find Twosum with subarray with starting index as (i+1) and end index as end of the nums array, target will be of course 0 - nums[i]
            int start = i + 1, end = nums.length-1, target = 0 - nums[i];
            while (start < end) {
                // If sum of elements at start and end index is equal to the twosum target, append (nums[i], nums[start], nums[end]) to the result list
                // Increment the start pointer by 1
                // Decrement end pointer by 1
                if (nums[start] + nums[end] == target) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    // Ignore repeated cases for first element of twosum as it will result in duplicates
                    while (start < end && nums[start] == nums[start-1]) {
                        start++;
                    }
                    // Ignore repeated cases for last element of twosum as it will result in duplicates
                    while (start < end && nums[end] == nums[end+1]) {
                        end--;
                    }
                } else if (nums[start] + nums[end] < target) { // If sum of elements at start and end index is less than the twosum target, increment start pointer by 1
                    start++;
                } else { // If sum of elements at start and end index is more than the twosum target, decrement end pointer by 1
                    end--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
    
}
