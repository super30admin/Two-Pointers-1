//Problem3 (https://leetcode.com/problems/container-with-most-water/)
//Accepted In LeetCode
//TC is O(n) and SC O(1)
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {

    let left = 0;
    let right = height.length-1;

    let max =0; let currArea =0;

    while(left<=right){
        

        if(height[left]<=height[right]){
            currArea = Math.min(height[left],height[right])*(right-left)
            left++
        }else{
            currArea = Math.min(height[left],height[right])*(right-left)
            right--
        }

        max=Math.max(max, currArea)
    }

return max;
    
};