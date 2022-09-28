// Problem1 (https://leetcode.com/problems/sort-colors/)

// Time Complexity : O(n), n is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
We use 3 ponters.
low points to 0
high points to 2
mid points to 1
*/

let swap = (nums, a, b) => {
    let temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function (nums) {
    if (nums === 0 || nums.length === 0) {
        return;
    }
    let low = 0;
    let high = nums.length - 1;
    let mid = 0;
    while (mid <= high) {
        // If mid is found, swap with high
        // Now high is 2 so high--
        if (nums[mid] === 2) {
            swap(nums, mid, high);
            high--;
        } else if (nums[mid] === 0) {
            // If mid === 0, swap with low now low has 0 so low++
            swap(nums, mid, low);
            mid++;
            low++;
        } else {
            mid++;
        }
    }
};