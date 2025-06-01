// ## Problem3 (https://leetcode.com/problems/container-with-most-water/)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NONE


// Your code here along with comments explaining your approach

// Your code here along with comments explaining your approach
var maxArea = function(height) {
    // Time Complexity : O(N)
// Space Complexity : O(1)
    let left = 0
    let right = height.length-1
    let maxArea1 = -Infinity
    while(left<right){
        //Take the mini wall and multiple it with the diff of right and left to get area
        maxArea1 = Math.max(maxArea1,Math.min(height[left],height[right])*(right-left))
        if(height[left]<=height[right]){
            left++
        }
        else{
            right--
        }
    }
    return maxArea1

};