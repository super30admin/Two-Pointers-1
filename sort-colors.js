// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    // Edge Case
    if (nums == null || nums.length == 0) return [];

    let leftIndex = 0,
        rightIndex = nums.length - 1,
        curr = 0;

    while (curr <= rightIndex) {
        if (nums[curr] == 0) {
            [nums[curr++], nums[leftIndex++]] = [nums[leftIndex], nums[curr]];
        } else if (nums[curr] == 2) {
            [nums[curr], nums[rightIndex--]] = [nums[rightIndex], nums[curr]];
        } else {
            curr++;
        }
    }

    return nums;
};
