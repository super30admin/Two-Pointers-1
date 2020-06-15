//Sort Colors (LC 75)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Figuring out I needed to add mid as a third pointer


// I tried two pointers but had to add a third pointer to make this approach work

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    if(nums.length === 0 || nums === null){
        return nums;
    }
    let mid = 0; 
    let low = 0;
    let high = nums.length - 1;
    while(mid<=high){
        if(nums[mid] === 1){
            mid++;
        } else if(nums[mid] === 2){
            swap(nums, mid, high);
            high--;
        } else {
            swap(nums, mid, low);
            low++;
            mid++;
        }
    }
    return nums;
};

let swap = function(nums,a,b){
    [nums[a],nums[b]] = [nums[b],nums[a]];
};