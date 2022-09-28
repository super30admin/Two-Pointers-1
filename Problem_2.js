// Problem2 (https://leetcode.com/problems/3sum/)

// Time Complexity : O(n^2logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    let ans = [];
    // Sorting the elements so we can use 2 pointer method
    nums.sort((a, b) => a - b);
    for (let i = 0; i < nums.length; i++) {
        // Fix the index, then it becomes a two sum problem
        // If number is same as previous, skip as the combination is already considered
        if (i > 0 && nums[i] === nums[i - 1]) {
            continue;
        }
        // If number is more than 0, all other numbers will be higher so sum cannot be 0, dont find more
        if (nums[i] > 0) {
            break;
        }
        // Maintain 2 pointers, start and end
        let left = i + 1;
        let right = nums.length - 1;
        // While start is less than end
        while (left < right) {
            // Calculate sum
            let sum = nums[i] + nums[left] + nums[right];
            if (sum === 0) {
                // If sum is 0, we have a combination, add to answer
                // Increament left and decreament right
                ans.push([nums[i], nums[left], nums[right]]);
                left++;
                right--;
                // If number is same as previous, skip as the combination is already considered
                while (left < right && nums[left] === nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] === nums[right + 1]) {
                    right--;
                }
            } else if (sum < 0) {
                // If sum is less than 0, we need a higher number so that it sums up to 0, left++
                left++;
            } else {
                // Else right--
                right--;
            }
        }
    }
    return ans;
};