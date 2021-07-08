// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Challenging problem


/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    const solutions = [];
    if (nums.length < 3) return solutions;
    nums = nums.sort((a, b) => a - b);
    for (let i = 0; i < nums.length - 2; i++) {
        if (nums[i] > 0) break;
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        j = i + 1;
        k = nums.length - 1;
        while (j < k) {
            let sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                solutions.push([nums[i], nums[j], nums[k]]);
                while (nums[j] === nums[j + 1]) j++;
				while (nums[k] === nums[k - 1]) k--;
                j++;
                k--;
            } else if (sum > 0) {
                k--;
            } else {
                j++;
            }
        }
    }
    return solutions;
}
