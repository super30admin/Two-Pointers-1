// # Two-Pointers-1
// ## Problem1 (https://leetcode.com/problems/sort-colors/)

// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : The condition where do not move l when swapping with 2 was not trivial 

var sortColors = function(nums) {
    //Time Complexity : O(N)
    //Space Complexity : O(1)
    let i = 0;           // position for 0
    let l = 0;           // current index
    let r = nums.length - 1; // position for 2
    while (l <= r) {
        if (nums[l] === 0) {
            [nums[i], nums[l]] = [nums[l], nums[i]];
            i++; // move 1 becasue we know it should be always 0
            l++; // 
        } else if (nums[l] === 2) {
            [nums[l], nums[r]] = [nums[r], nums[l]];
            r--; // dont move the left pointer becasue we dont know what thrown from back at us not always 0 
        } else {
            l++; // WHen L === 1 just move j do nothing 
        }
    }
    return nums
};
// console.log(sortColors([2,0,1]))
