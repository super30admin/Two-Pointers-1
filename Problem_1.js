// https://leetcode.com/problems/sort-colors/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We assume three pointers for three colors and swap the 0,1, and 2 according to their final positions. 

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {

    if(nums === null || nums.length === 0) return; 
    //Assign three pointers to each of the colors final position. 
    let left = 0, right = nums.length-1, mid = 0;

    while(mid<=right){
        //If we find 0 then we swap its place with left pointer
        if(nums[mid] === 0){
            let tmp = nums[mid];
            nums[mid] = nums[left];
            nums[left] = tmp;
            left++;
            mid++;
        }
        //If we find 2 then we swap its place with right pointer
        else if(nums[mid] === 2){
            let tmp = nums[mid];
            nums[mid] = nums[right];
            nums[right] = tmp;
            right--;
        }
        //If we find 1 then we do nothing and increase the mid
        else mid++;
    }
};