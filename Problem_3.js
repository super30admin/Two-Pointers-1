// Problem3 (https://leetcode.com/problems/container-with-most-water/)

// Time Complexity : O(m), m is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
Water filled will be base * smaller height
base = array.length
start = 0
end = last element
Find the area and compare with max value, if more, update
increament pointer which has lower height
decrease base by 1
*/
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    console.log(height.length - 1)
    base = height.length - 1;
    let start = 0;
    let end = height.length - 1;
    let max = 0;
    while (start < end) {
        if (height[start] <= height[end]) {
            max = Math.max(max, (base * height[start]));
            start++;
        } else {
            max = Math.max(max, (base * height[end]));
            end--;
        }
        base--;
    }
    return max;
};