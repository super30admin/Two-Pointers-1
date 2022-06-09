// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
 var sortColors = function(nums) {
    let left = 0;
    let right = nums.length - 1;
    let mid = 0;
    
    while(mid <= right){
        if (nums[mid] === 1) {
            mid++;
        } else if (nums[mid] === 0) {
             [nums[left], nums[mid]] = [nums[mid], nums[left]];
            left++; //we increment left here by +1, since we know, we values in left are all 0
            mid++;
        } else if (nums[mid] === 2) {
            [nums[right], nums[mid]] = [nums[mid], nums[right]];
            right--; //we dont increment mid here, as, mid could be possible 0, and we dont want to skip 0
        }
    }
    return nums;
};
