// Time Complexity : O(n) where n is the length of nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// I am taking three pointers, low and mid will start from 0 and high will be the length of nums
var sortColors = function(nums) {
    let low = 0;
    let mid = 0;
    let high = nums.length-1;
    while(mid <= high) {
        // if mid is at 2 swap it with high and move high pointer by 1
        if(nums[mid] === 2) {
            let temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        // if mid is at 0 swap it with low and move mid and low pointer by 1
        } else if(nums[mid] === 0) {
            let temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            mid++;
            low++;
        // if mid is 1 just move pointer by 1
        } else {
            mid++;
        }
    }
};