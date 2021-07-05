// ## Problem3 
// (https://leetcode.com/problems/container-with-most-water/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const maxArea = function(height) {
    if(!height || height.length === 0) return 0;
    let j = height.length - 1, i =0, temp = 0;
    let max = (j - i) * Math.min(height[i], height[j]);
    while(i <= j) {
        if(height[i] < height[j]) i++;
        else j--;
        temp = (j - i) * Math.min(height[i], height[j]);
        if(temp > max) max = temp;
    }
    return max;
};