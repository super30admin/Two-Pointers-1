// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    if(height == null || height.length == 0) return 0
    let max = 0, low = 0, high = height.length-1;
    while(low < high) {
        if(height[low] < height[high]){
            max = Math.max(max, height[low] * (high - low));
            low++
        }
        else {
            max = Math.max(max, height[high] * (high - low));
            high--
        }
    }
    return max
    
    
};


