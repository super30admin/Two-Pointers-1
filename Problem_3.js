//https://leetcode.com/problems/container-with-most-water/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Calculate the area by assigning left and right pointers, then loop till left and right pointers are not equal. 
// Return the max value
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let max = -99999;
    let n = height.length;
    // Initialize left and right pointers
    let l = 0, r=n-1;
    // Loop till left and right are not equal or cross over.

    while(l<r){
        //We calculate the current area by taking the smallest number between the left and right pointer value and the distance between them
        let currA = (r-l)*Math.min(height[l], height[r]);
        //Compare and assign max area at each loop
        max = Math.max(currA, max);

        //Determine the better possibility, since we need max are, we move the pointer of the smallest element
        if(height[l] < height[r]){
            l++;
        }
        else{
            r--;
        }
    }
    return max;
};