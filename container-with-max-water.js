// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    if (height == null || height.length == 0) return 0;
    let currMax = 0;
    let left = 0;
    let right = height.length - 1;
    while (left < right) {
        currMax = Math.max(currMax, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return currMax;
};
