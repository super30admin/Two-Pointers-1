// ## Problem1 
// (https://leetcode.com/problems/sort-colors/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const swap = function(nums, i, j) {
    let temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
const sortColors = function(nums) {
    if(!nums || nums.length === 0) return nums;
    let left = 0, mid = 0, right = nums.length - 1;
    let temp = 0;
    while(mid <= right) {
       if(nums[mid] === 1) mid++;
        else if (nums[mid] === 2) {
            swap(nums, mid, right);
            right--;
        }
        else {
            swap(nums, left, mid);
            left++;
            mid++;
        }
    }
    return nums;           
};