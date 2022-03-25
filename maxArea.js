// Time Complexity : O(n) where n is the length of height
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} height
 * @return {number}
 */

// Taking two pointer left and right
// Checking the max by calculating height * length between two pointer and comparing with previous max value.
// If new value is greater than storing new value in max.
var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1;
    let max = 0;
    while(left<right) {
        max = Math.max(max, Math.min(height[left],height[right]) * (right - left));
        if(height[left] <= height[right]) left++;
        else right--;
    }
    return max;
};