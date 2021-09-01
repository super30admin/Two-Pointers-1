// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var maxArea = function (height) {
    let max = 0, low = 0, high = height.length - 1;

    if (height.length <= 0 || !height) {
        return 0;
    }

    while (low < high) {
        max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
        if (height[low] <= height[high]) {
            low++;
        } else {
            high--;
        }
    }
    return max;


}