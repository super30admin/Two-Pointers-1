//Container With Most Water (LC 11)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Basically calculate length times height

/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    if(height === null || height.length === 0){
        return 0;
    }
    let low = 0;
    let high = height.length-1;
    let maxArea = -1;
    while(low < high){
        let area = ((high - low) * Math.min(height[high],height[low]))
        maxArea = Math.max(area,maxArea);
       low++;
    }
    return maxArea;
};